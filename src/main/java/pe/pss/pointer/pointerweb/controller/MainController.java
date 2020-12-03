package pe.pss.pointer.pointerweb.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.security.Principal;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
    public static final String url = "https://www.google.com/recaptcha/api/siteverify";
    private final static String USER_AGENT = "Mozilla/5.0";
    
    @Value("${recaptcha.key.site}")
    private String publica;
    
    @Value("${recaptcha.key.secret}")
    private String secreto;
	
    ModelAndView mavIndex = new ModelAndView("index");


	@RequestMapping(value = "/index")
	public ModelAndView index(Principal principal) {
		String user = principal.getName();
		mavIndex.addObject("principal", user);
		return mavIndex;
	}

	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest srv) throws IOException {
		//String token = String.valueOf(srv.getParameter("g-recaptcha-response"));
		//boolean result = verificar(token);
		srv.setAttribute("captcha", publica);
		return new ModelAndView("login");
	}
	
	
	@RequestMapping(value = "/obterner-rcaptcha-clave-publica", method = RequestMethod.POST)
	@ResponseBody
	public StringBuilder obtenerClavePublicaCaptcha(HttpSession session,
	HttpServletRequest servletRequest) {
	StringBuilder result = new StringBuilder();
	result = new StringBuilder(publica);
	return result;
	}
		 
	private boolean verificar(String gRecaptchaResponse) throws IOException {
		    
	        if (gRecaptchaResponse == null || "".equals(gRecaptchaResponse)) {
	            return false;
	        }
	        try {
	            URL obj = new URL(url);
	            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
	            con.setRequestMethod("POST");
	            con.setRequestProperty("User-Agent", USER_AGENT);
	            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
	            String postParams = "secret=" + secreto + "&response=" + gRecaptchaResponse;
	            con.setDoOutput(true);
	            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	            wr.writeBytes(postParams);
	            wr.flush();
	            wr.close();
	            int responseCode = con.getResponseCode();
	            System.out.println("Enviando 'POST' peticion a URL : " + url);
	            System.out.println("Parametros post : " + postParams);
	            System.out.println("Codigo de respuesta : " + responseCode);
	            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            String inputLine;
	            StringBuffer respuesta = new StringBuffer();
	            while ((inputLine = in.readLine()) != null) {
	                respuesta.append(inputLine);
	            }
	            in.close();
	            System.out.println(respuesta.toString());
	            JsonReader jsonReader = Json.createReader(new StringReader(respuesta.toString()));
	            JsonObject jsonObject = jsonReader.readObject();
	            jsonReader.close();
	            return jsonObject.getBoolean("success");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

}
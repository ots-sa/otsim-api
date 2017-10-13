package ots.otsim.api;

import java.util.Arrays;

import com.io.swagger.client.ApiException;
import com.io.swagger.client.api.DefaultApi;
import com.io.swagger.client.model.UserCreateRequest;

public class ApiTest {

	public static void main(String args[]) {
		DefaultApi dapi = new DefaultApi();
		dapi.getApiClient().setApiKey("fHCNC_gksqb3v2iiEIH2AqnLLjgab5El5uqV040PaEi");
		dapi.getApiClient().setUserId("iHXsAQqkJQfPas3As");
		
		UserCreateRequest ureq = new UserCreateRequest();
		ureq.setUsername("sbobos1");
		ureq.setName("Sbobos Spasoklabanias1");
		ureq.setEmail("sbobos1@mailinator.com");
		ureq.setPassword("otsdba");
		ureq.setRoles(Arrays.asList("user"));
		
		try {
			dapi.createUser(ureq);
			System.out.println("OK REE!!");
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package in.ashokit.main;
import in.ashokit.binding.*;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class App {

	public static void main(String[] args) throws Exception {
		App app= new App() ;
		app.convertJsonToJava();
	
	}
	
	public void convertJavaToJson() throws Exception {
		User user = new User(101,"Ashok","Male",123456L);
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.writeValue(new File("user.json"), user);
		System.out.println("Converted java to json");
	}
	
	
	public void convertJsonToJava() throws Exception{
		
		ObjectMapper objMapper = new ObjectMapper();
		User user= objMapper.readValue(new File("user.json"), User.class);
		System.out.println(user);
	}
	
}

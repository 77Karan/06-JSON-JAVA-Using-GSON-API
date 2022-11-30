package in.ashokit.convertors;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import in.ashokit.bindings.Customer;

public class JsonToJava 
{
	public static void main(String[] args) throws Exception
	{
		Gson gson = new Gson();
		Customer cust = gson.fromJson(new FileReader(new File("customer.json")),Customer.class);
		System.out.println(cust);
	
		
	}

}

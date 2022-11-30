package in.ashokit.convertors;

import com.google.gson.Gson;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.InsurancePolicy;
import in.ashokit.bindings.Customer;


public class JavaToJason 
{
	public static void main(String[] args) 
	{
		InsurancePolicy ip = new InsurancePolicy("TATA","01-01-2020","01-01-2021",300);
		Address add = new Address("Bangalore",123,"Ind");
		Customer c1 = new Customer("Karan",ip,add);
		
		Gson gson = new Gson();
		String json = gson.toJson(c1);
		System.out.println(json);
		
		
	}

}

package in.ashokit.bindings;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address 
{
	private String city;
	private int pinCode;
	private String country;

}

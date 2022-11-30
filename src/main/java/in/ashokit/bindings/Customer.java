package in.ashokit.bindings;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer 
{
	private String custName;
	private InsurancePolicy ip;
	private Address adrr;

}

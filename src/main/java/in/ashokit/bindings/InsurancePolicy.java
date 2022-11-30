package in.ashokit.bindings;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsurancePolicy 
{
	private String insuranceName;
	private String insuranceStartDate;
	private String insuranceEndDate;
	private int insuranceAmt;

}

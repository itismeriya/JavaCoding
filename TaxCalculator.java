package exceptionHandling;

public class TaxCalculator {
	 public double CalculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException,EmployeeNameInvalidException, TaxNotEligibleException{
		 if (!isIndian) {
	         throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
	      }
	      
	      if (empName == null || empName.isEmpty()) {
	          throw new EmployeeNameInvalidException("The employee name cannot be empty.");
	      }
	      if (empSal>100000 && isIndian) {
	          return empSal*8/100;
	      } else if (empSal>=50000 && empSal<=100000 && isIndian) {
	          return empSal*6/100;
	      } else if (empSal>=30000 && empSal<50000 && isIndian) {
	          return empSal*5/100;
	      } else if (empSal>=10000 && empSal <30000 && isIndian) {
	          return empSal*4/100;
	      } else {
	          throw new TaxNotEligibleException("The employee does not need to pay tax.");
	      }
			
		}
}

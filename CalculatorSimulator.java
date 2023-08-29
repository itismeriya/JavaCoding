package exceptionHandling;

public class CalculatorSimulator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator calculator = new TaxCalculator();
        String empName = "Ron";
        boolean isIndian = false;
        double empSal = 34000;

        try {
            double taxAmount = calculator.CalculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is: "+taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid:"+e.getMessage());
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid:"+e.getMessage());
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation:"+e.getMessage());
            e.printStackTrace();
        }
	}

}

package calc;

public class Tax {
 public static double salaryTaxCalc(Double wage) {
	 Double taxPercent = 0.0;
	 if (wage < 15000) {
		 taxPercent = 0.0;
		 
	 } else if(wage >= 15000 && wage <20000) {
		 taxPercent = 10.0;
	 }else if(wage >= 20000 && wage <30000) {
		 taxPercent = 15.0;
	 }else if(wage >= 30000 && wage <45000) {
		 taxPercent = 20.0;
	 }else if(wage > 45000) {
		 taxPercent = 25.0;
	 }
	 
	 return taxPercent; 
 }
 
 public static double taxAmountCalc(Double wage) {
 
 Double taxBracket;
 taxBracket = Tax.salaryTaxCalc(wage);
 
System.out.println("Total tax amount paid is: " + (wage * taxBracket)/100);
return (wage * taxBracket)/100;
}
 
 
 public static void main(String[] args) {
	    Tax.taxAmountCalc(123415.0);
	  }
 
}

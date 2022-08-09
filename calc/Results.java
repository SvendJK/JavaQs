package calc;
import java.math.*;

public class Results {
	double physics = 20;
	double chemistry= 130.5;
	double biology =20;
	double total = 330.5;
	double percentage ;
	public void DisplayResult () {
		System.out.println("Mark for Physics : " + physics);
		System.out.println("Mark for chemistry : " + chemistry);
		System.out.println("Mark for biology : " + biology);
		System.out.println("TOTAL MARK : " + total);
		
	}
	public Double PercentageOfIndividualMark(Double input) {
		Double Mark;
		Mark = (input *100) / 150;
		return Mark;
	}
	
	public void DisplayPercentage() {
		percentage = (total * 100) / 450;
		if (percentage < 60) {
			System.out.println("YOU FAILED");
		} else if (PercentageOfIndividualMark(physics) < 60){
			System.out.println("Failed physics");
		}else if (PercentageOfIndividualMark(chemistry) < 60){
			System.out.println("Failed chem");
		}else if (PercentageOfIndividualMark(biology) < 60){
			System.out.println("Failed biology");
		} else
		
		System.out.println("you passed. percentage: " + percentage);
	}
		
	public static void main(String[] args) {
	    Results results = new Results();	
	    results.DisplayPercentage();
	    results.bigflowchart(4000);
	    results.blackjack(22,23);
	    results.uniquesum(22,23,22);
	  }
	
	private static int flowchart(int one, int two, boolean b) {
	if (b=true) {
	return one+two;
	}else {
	return one*two;
	}	
}
	public  void bigflowchart(int a) {
	if(a>2000) {
		System.out.println("A");
		if (a>6000){
		System.out.println("C");
		}else {
		System.out.println("B");
		if(a>4000){
			System.out.println("D");
			
		}else {
			System.out.println("E");
		}
		}
	}else {
		System.out.println("1");
		if(a>100) {
			System.out.println("3");
				if(a>600) {
					System.out.println("5");
				} else {
					System.out.println("4");
						if(a>500) {
							System.out.println("6");
						} else {
							System.out.println("7");
						}
				}
		} else {
			System.out.println("2");
		}
		}
	}
	
	public int blackjack(int a, int b) {
		if(a <=0 || b <=0) {
			System.out.println("PLease enter valid numbers");
		} else if(a>21 && b>21) {
			System.out.println("0");
			return 0;
			
		
		}else {
		System.out.println(Math.max(a,b));
		return Math.max(a,b);
		}
		return 0;
		
		
	}
	public int uniquesum(int a, int b, int c) {
		if (a==b){
			a=0;
		    b=0;
		    System.out.println(a+b+c);
		    return a+b+c;
		} else if (b==c){
			b=0;
		    c=0;
		    System.out.println(a+b+c);
		    return a+b+c;
		}else if (c==a){
			c=0;
		    a=0;
		    System.out.println(a+b+c);
		    return a+b+c;
		} else {
			System.out.println(a+b+c);
			return a+b+c;
		}
	
}
}
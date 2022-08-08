package calc;

public class Results {
	double physics = 110;
	double chemistry= 130.5;
	double biology =100;
	double total = 330.5;
	double percentage ;
	public void DisplayResult () {
		System.out.println("Mark for Physics : " + physics);
		System.out.println("Mark for chemistry : " + chemistry);
		System.out.println("Mark for biology : " + biology);
		System.out.println("TOTAL MARK : " + total);
		
	}
	
	public void DisplayPercentage() {
		percentage = (total * 100) / 450;
		System.out.println("percentage: " + percentage);
	}
}


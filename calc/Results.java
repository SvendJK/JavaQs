package calc;

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
	  }
	}



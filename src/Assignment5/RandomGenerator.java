package Assignment5;

public class RandomGenerator {
	
	public String isNumberGreater() {
		double random = Math.random();
		if(random < 0.5) {
			return "Value is less than 0.5";
		} else if(random > 0.5) {
			return "Value is greater than 0.5";
		} else return "Value is equal to 0.5";
	}
	
}

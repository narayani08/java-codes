package Assignment21;

import java.time.LocalDate;

public class DatesWorking {
	
	public static void main(String[] args) {
		LocalDate local = LocalDate.of(1995, 02, 17);
		LocalDate ninty = local.plusDays(90);
		System.out.println(ninty);
	}

}

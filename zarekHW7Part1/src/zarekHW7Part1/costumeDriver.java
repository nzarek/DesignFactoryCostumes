/*
Nicholas Zarek
CSCV 335
Design Factory Driver
*/
package zarekHW7Part1;

import java.util.ArrayList;
import java.util.Scanner;

public class costumeDriver {

	public static void main(String[] args) {
		
		costumeCreator createFancy = new fancyStore();
		
		costumeCreator createEarth = new earthFairyStore();
		
		ArrayList<String> costumePurchase = new ArrayList<String>();

		
		Scanner userInput = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter your costume type: (P)irate / (N)obility / (F)airy / (L)eprechaun");
			String arrayEntry = userInput.nextLine();
			costumePurchase.add(arrayEntry);		
		}
		
		
		for (int y = 0; y < costumePurchase.size(); y++) {
			String costumeFactory = (String) costumePurchase.get(y).toUpperCase(); 
			
			if  (costumeFactory.equalsIgnoreCase("P") || costumeFactory.equalsIgnoreCase("N")) {
				costume fancyCostume = createFancy.orderCostume(costumeFactory);
				System.out.println(fancyCostume + "\n");
			} else if (costumeFactory.equalsIgnoreCase("F") || costumeFactory.equalsIgnoreCase("L")) {
				costume earthCostume = createEarth.orderCostume(costumeFactory);
				System.out.println(earthCostume + "\n");
			} else {
				System.out.println(costumeFactory + " Is not a valid entry. No costume provided.\n");
			}
		}
		
		userInput.close();
	}

}

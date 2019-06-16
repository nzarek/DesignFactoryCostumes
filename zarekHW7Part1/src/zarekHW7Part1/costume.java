/*
Nicholas Zarek
CSCV 335
Design Factory Product Creator
*/

package zarekHW7Part1;

import java.util.ArrayList;

public abstract class costume {

	String name;
	String slogan;
	ArrayList<String> attire = new ArrayList<String>();
	
	public void addAttire() {
		for (String attireSet : attire) {
			System.out.println("Costume includes: " + attireSet);
		}	
	}
	
	public void stateName() {
		System.out.println("Costume name: " + name);
	}
	
	public void stateSlogan() {
		if (slogan == "FANCY") {
			System.out.println("Now go and fight! arrrrg!");
		} else {
			System.out.println("We come in peace!");
		}
	}
}

/*
Nicholas Zarek
CSCV 335
Design Factory Earth Fairy Factory
*/

package zarekHW7Part1;

public class earthFairyStore extends costumeCreator {

	public earthFairyStore() {
		
	}

	@Override
	protected costume createCostume(String type) {

		costume myCostume = null;
		
		System.out.println("Earth Fairy Costume purchased!");
		if (type.contentEquals("F")) {
			myCostume = new fairyCostume();
		} else if (type.contentEquals("L")) {
			myCostume = new leprechaunCostume();
		}
		return myCostume;
	}
	
}

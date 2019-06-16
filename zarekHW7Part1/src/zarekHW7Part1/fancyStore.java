/*
Nicholas Zarek
CSCV 335
Design Factory Fancy Factory
*/

package zarekHW7Part1;

public class fancyStore extends costumeCreator {

	public fancyStore() {
		
	}
	
	@Override
	protected costume createCostume(String type) {

		costume myCostume = null;
		System.out.println("Fancy Costume purchased!");
		if (type.contentEquals("P")) {
			myCostume = new pirateCostume();
		} else if (type.contentEquals("N")) {
			myCostume = new nobilityCostume();
		}
		
		
		return myCostume;		
	}

}

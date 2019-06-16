/*
Nicholas Zarek
CSCV 335
Design Factory Creator
*/

package zarekHW7Part1;

public abstract class costumeCreator {

	public costume orderCostume(String type) {
		
		costume costume;
		costume = createCostume(type);
		
		costume.stateName();
		costume.addAttire();
		costume.stateSlogan(); 
		return costume;
		
	}
	
	protected abstract costume createCostume(String type);
		
}

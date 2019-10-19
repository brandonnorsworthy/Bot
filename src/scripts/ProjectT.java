//Copyright Brandon Norsworthy 2019

package scripts;

import org.tribot.api.General;
import org.tribot.api2007.WebWalking;
import org.tribot.script.Script;


public class ProjectT {
	
	//notes
		//keep 5k coins in inventory always
		//keep all leather/cow hide in bank
	
	//variables
	boolean checkedBank = false;
	
	//run
	public void run() {
		//walk to nearest bank
		//teleport to lumbridge
		//walk to alkarid
		
		//loop continuously doing checkups about positioning and player count in the area
	}
	
	//tanner method
	void tannerHandler() {
		//walk to alkarid bank
		//put all items in bank
		//withdraw coins
		//withdraw cowhides
		//walk to tanner
		//tan to hard leather
		//walk back to bank
		//loop method if still have cowhides
	}
		
	//grand exchange method
	void grandExchangeHandler() {
		//sell leather
		//buy cow hide
	}
	
	//bank handler
	void bankHandler(String itemName, int Quantity) {
		//take item name and grab that item
	}
	
	//world hopper
	void shouldWorldHop() {
		//if 3 people are around hop worlds
	}
}
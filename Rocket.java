package spacechallenger;
import spacechallenger.Item;
import spacechallenger.Spaceship;

public class Rocket implements Spaceship{
	
	protected int price;
	protected int rocketWeight;
	protected int weightLimit;
	
	protected int currentWeight = rocketWeight; // rocket is empty
	

	public boolean launch() {
		return true;
	}


	public boolean land() {
		return true;
	}


	
	public  final boolean canCarry(Item item) {
		boolean temp;
		
		//a loop will come here where the weights of items stored in a arraylist would be added
		
		
		if(this.currentWeight +  item.weight <= this.weightLimit) {
			System.out.println("The item " + item.name  +  " of weight " + item.weight + "  amount of load can be carried!!");
			temp = true;
		}
		else {
			System.out.println("The item  " + item.name + " of weight " + item.weight + " load cannot be carried");
			temp = false;
		}
	
		return temp;
	}

	public final void carry(Item item) {
		this.currentWeight = this.currentWeight + item.weight; 
	System.out.println("Current weight is :" + this.currentWeight);
	
	}
	
//	//test block
//	public static void main(String[] args) {
//		
//		Item box = new Item("box",1000);
//		Rocket testRocket = new Rocket();
//		boolean myResult = testRocket.canCarry(box);
//		System.out.println(myResult);
//		testRocket.carry(box);
//	}
// 
}

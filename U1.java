package spacechallenger;
import spacechallenger.Item;
import java.util.Random;

public class U1 extends Rocket {
	
	public U1() {
		this.price = 100;   
		this.rocketWeight = 10000;  
		this.weightLimit = 18000;   
		this.currentWeight = this.rocketWeight;
	}
	
	
	Random random = new Random();
 	
	public boolean launch() {
		boolean canLaunch = true;
		int probOfFailure = Math.round(5 * this.currentWeight / this.weightLimit);
		
		
		int randomNo = (random.nextInt(100) +1) ;
		//System.out.println("Random no is :"+ randomNo);
		if(randomNo <= probOfFailure) {
			canLaunch = false;
		}
		return canLaunch;
	}
	
	public boolean land() {
		boolean canLand = true;
		int probOfFailure =Math.round( 1 * this.currentWeight/this.weightLimit); //try to find approx more properly
		int randomNo = (random.nextInt(100)+1);
		
		if(randomNo <= probOfFailure) {
			canLand = false;
		}
		return canLand;
	}
	
	
//	public static void main(String[] args) {
//		U1 u1 = new U1();
//		boolean answer = u1.launch();
//		System.out.println(answer);
//		}

}

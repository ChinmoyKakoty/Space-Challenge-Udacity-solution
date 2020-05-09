package spacechallenger;

import java.util.ArrayList;




public class MainClass {

	public static void main(String[] args) {
		SimuationAlpha simulation=new SimuationAlpha();

		 ArrayList<Item>itemsListPhase1=simulation.loadItems(1);
		 
		 
		 ArrayList<Item>itemsListPhase2=simulation.loadItems(2);
		                 
		 ArrayList<Rocket>rocketListPhase1=simulation.loadU1(itemsListPhase1);
		 ArrayList<Rocket>rocketListPhase2=simulation.loadU1(itemsListPhase2);
           
		 
		 
		   int phaseOneCount1=simulation.runSimulation(rocketListPhase1);
		   int phaseOneCount2=simulation.runSimulation(rocketListPhase2);
		   
		   System.out.println("the cost of u1 first phase is="+ phaseOneCount1+ "millions");
		   System.out.println("the cost of u1 second phase is="+phaseOneCount2+"millions");
			
           
ArrayList<Rocket>rocketListPhase1U2=simulation.loadU2(itemsListPhase1);
ArrayList<Rocket>rocketListPhase2U2=simulation.loadU2(itemsListPhase2);

		 
			 
			   int phaseOneCount1OfU2=simulation.runSimulation(rocketListPhase1U2);
			   int phaseOneCount2OfU2=simulation.runSimulation(rocketListPhase2U2);
			   
			   System.out.println("the cost of u2 first phase is="+ phaseOneCount1OfU2+ "millions");
			   System.out.println("the cost of u2 second phase is="+phaseOneCount2OfU2+"millions");
			   
		 
		
			   
	}

}

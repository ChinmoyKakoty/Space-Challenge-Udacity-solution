package spacechallenger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimuationAlpha {
	public ArrayList<Item> loadItems(int phaseNo){
		String phase = "";
		ArrayList<Item> itemList = new ArrayList<Item>();
		try {
			
			if(phaseNo == 1) {
				System.out.println("Running Phase 1>>>");
				phase = "phase-1.txt";
			}
			
			else if(phaseNo == 2) {
				System.out.println("Running Phase 2>>>");
				phase = "phase-2.txt";
			}
			
			File file = new File(phase);
			Scanner fileScanner = new Scanner(file);
			
			while(fileScanner.hasNextLine()) {
				
				String line = fileScanner.nextLine();
				String[] itemInfo = line.split("=");				
				Item item = new Item(itemInfo[0],Integer.parseInt(itemInfo[1]));
				itemList.add(item);
	//		System.out.println("this item is :"+item.name+"   =   "+item.weight);
			}
			fileScanner.close();
			
		
	}catch(FileNotFoundException ex){
		
		System.out.println("Error With the file name!!");
		ex.printStackTrace();
	}
		
	return itemList;

    }
	
	ArrayList<Rocket> loadU1 (ArrayList<Item> itemsList){
		
		ArrayList<Rocket> rockets=new ArrayList<>();
		Rocket rocket1=new U1();
		for(Item r1:itemsList)
		{
			if(rocket1.canCarry(r1)) {
				rocket1.carry(r1);
			}else {
				
			rockets.add(rocket1);
			rocket1=new U1();
			System.out.println("New rokcet R2 of U1 created");
			rocket1.carry(r1);
			
		       }
		
			}
		return rockets;
	}
	
	ArrayList<Rocket> loadU2 (ArrayList<Item> itemsList){
		
		ArrayList<Rocket> rockets=new ArrayList<>();
		Rocket rocket1=new U2();
		for(Item r1:itemsList)
		{
			if(rocket1.canCarry(r1)) {
				rocket1.carry(r1);
			}else {
				
			rockets.add(rocket1);
			rocket1=new U2();
			System.out.println("New Rocket R2 of U2 created");
			rocket1.carry(r1);
		       }
		
			}
		return rockets;
	}
	 public int runSimulation(ArrayList<Rocket>rockets) {
  	   int costOfRocket=0;
  	   for(Rocket u1:rockets) {
  		  boolean launchVar=u1.launch();
  	      boolean landVar=u1.land();
  	      costOfRocket=costOfRocket+u1.price;
  		     while(!launchVar==true && landVar==true) {
  		    	 launchVar=u1.launch();
  		    	 landVar=u1.land();
  		    	costOfRocket=costOfRocket+u1.price;
  		     }
  		      
  	   }
  	         return costOfRocket;
  	   
}
	 
}


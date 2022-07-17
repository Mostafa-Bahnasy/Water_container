import java.util.Scanner;
import java.util.Vector;
import java.util.*;  

class st{
	double vol=0,rem=0;
}

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<st>answer= new Vector<st>();
		// get number of containers
         int NumberContainer =0;
         System.out.print("Enter number of containers: ");
         Scanner scan = new Scanner(System.in) ;
			NumberContainer = scan.nextInt();
		//-----------------------------	
		  
        ////////////////////////////do algo
         while(NumberContainer-- >0) {
        	 // get cylinder or rectangle 
        	 int operation=0;
        	 System.out.print("Enter 1 to create a cylinder, and 2 to create rectangle: ");
        	 operation = scan.nextInt();
     		 /////////////////////////////
        	 if(operation==1) {// cylinder
        		 Cylinder obj=new Cylinder();
        		 obj.getInput();
        		 st temporary =obj.calculate();
        		 answer.addElement(temporary);
        	 }
        	 else { // cube
        		 Cube obj=new Cube();
        		 obj.getInput();
        		 st temporary =obj.calculate();
        		 answer.addElement(temporary);
        	 }
        	 
         }
        //////////////////////////////////////
         //sort
         for(int i=0;i<answer.size();i++) {
        	 for(int j=i+1;j<answer.size();j++) {
        		 if(answer.get(i).rem>answer.get(j).rem) {
        			 Collections.swap(answer,i,j);
        		 }
        	 }
         }
         // now print answer
         for(int i=0;i<answer.size();i++) {
        	 System.out.println((i+1)+":\n"+"Volume: "+answer.get(i).vol +"\tRemining: "+answer.get(i).rem);
         }
	}

}

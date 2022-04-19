import java.util.Scanner;


public class Cube extends Shape{

	
	public void getInput(){
		
		Scanner in=new Scanner(System.in);
		
		//--------get input--------------
		
		System.out.print("ENTER LENGHT: ");
		int radious=in.nextInt();
		setLen(radious);
		
		System.out.print("Enter height: ");
		int hieght=in.nextInt();
		setHeight(hieght);
		
		System.out.print("ENTER WIDTH: ");
		int width=in.nextInt();
		setWid(width);
		
		System.out.print("Enter Filled amount in cubic meter: ");
		int water=in.nextInt();
		setWater(water);
		
		//-------end input---------------
		
	}

	@SuppressWarnings("null")
	public st calculate() {
		
		double cube_vol = (double)1*getHeight()*getLen()*getWid(); 	
		
		st re=new st();
		
		re.rem=(double)cube_vol-getWater();
		re.vol=(double)cube_vol;
		
		return re;
			
   }
}

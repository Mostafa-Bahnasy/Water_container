import java.util.Scanner;

public class Cylinder extends Shape {
public double pi=3.14;
public void getInput(){
	
	Scanner in=new Scanner(System.in);
	
	//--------get input--------------
	
	System.out.print("ENTER RADIOUS: ");
	int radious=in.nextInt();
	setLen(radious);
	
	System.out.print("Enter height: ");
	int hieght=in.nextInt();
	setHeight(hieght);
	
	System.out.print("Enter Filled amount in cubic meter: ");
	int water=in.nextInt();
	setWater(water);
	
	//-------end input---------------
	
}
	
@SuppressWarnings("null")
public st calculate() {
	// get volume
double cylinder_vol = (double)1*getHeight()*(getLen()*getLen()*pi); 
// make return struct
st re=new st();
// assign it 
re.rem=(double)cylinder_vol-getWater();
re.vol=(double)cylinder_vol;
/// return
return re;
	
}


}

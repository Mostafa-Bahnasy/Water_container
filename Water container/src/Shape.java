

public abstract class Shape {
    // private arguments
    private int len=0;
    private int height=0;
    private int width=0;
    private int water=0;
    //-------------------
    // getter and setter
    // get length
    public int getLen(){
        return this.len;
    }
    // set length
    public void setLen(int len){
        this.len=len;
    }
    // get width
    public int getWid(){
        return this.width;
    }
    // set width
    public void setWid(int width){
        this.width=width;
    }
    // get water
    public int getWater(){
        return this.water;
    }
    // set water
    public void setWater(int water){
        this.water=water;
    }
    // get height
    public int getHeight(){
        return this.height;
    }
    // set height
    public void setHeight(int height){
        this.height=height;
    }
    //---------------------
    
    // constructors
    Shape(int len_temp,int width_temp){
        len=len_temp;
        width=width_temp;
    }
    Shape(int len_temp,int width_temp,int height_temp){
        len=len_temp;
        width=width_temp;
        height=height_temp;
    }
    Shape(int len_temp){
        len=len_temp;
    }
    Shape(){};
    //---------------------
    //functions
    public void getInput() {}
    public st  calculate(){st re = null ; return re;}
}

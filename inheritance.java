class Bicycle{
    public int gear;
    public int speed;
    public Bicycle(){};
    public Bicycle(int gear,int speed)
    {
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBrake(int decr)
    {
        speed-=decr;
    }
    public void speedUp(int inr)
    {
        speed+=inr;
    }
    public String toDisplay(){

        return ("No of gears are: "+gear+"\nSpeed of Bicycle is: "+speed);
    }

}
class MoutainBike extends Bicycle{
    public int seatHeight;
    public  MoutainBike(int gear,int speed,int seatHeight){
        super(gear,speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int Val){
        seatHeight = Val;
    }
    @Override public String toDisplay(){
        return (super.toDisplay()+"\nseat height is : "+seatHeight);
    }

}

public class inheritance {
    public static void main(String[] args) {
        MoutainBike m = new MoutainBike(7, 120, 25);
        System.out.println(m.toDisplay());
    }
    
}

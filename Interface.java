interface vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBreak(int a);
}
class Bicycle implements vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newgear){
        gear = newgear;
    }
    @Override
    public void speedUp(int incr){
        speed+=incr;
    }
    @Override
    public void applyBreak(int decr){
        speed-=decr;
    }
    public void printstates(){
        System.out.println("Speed: "+speed+" "+"gear: "+ gear);
    }
}
class Bike implements vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newgear){
        gear=newgear;
    }
    @Override
    public void speedUp(int incr){
        speed+=incr;
    }
    @Override
    public void applyBreak(int decr){
        speed-=decr;
    }
    public void printstates(){
        System.out.println("Speed: "+speed+" "+"gear: "+ gear);
    }
}
public class Interface {
    public static void main(String[] args) {
        
        //Instance of bicycle

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.speedUp(10);
        bicycle.applyBreak(2);
        System.out.println("Bicycle present state: ");
        bicycle.printstates();

        // Instance of Bike

        Bike bike =new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBreak(3);
        System.out.println("Bike present state: ");
        bike.printstates();
    }
    
}

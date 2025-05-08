public class finalizexample {
    public static void main(String[] args) {
        finalizexample f = new finalizexample();
        System.out.println("Hashcode is: "+ f.hashCode());
        f = null;
        System.gc();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End of the garbage collector");

    }
    @Override protected void finalize(){
        System.out.println("Called a finalize() method");
    }
    
}

public class TNSIF extends Thread {
    private String msg;
    TNSIF(String msg){
        this.msg=msg;
        
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String args[])
    {
        TNSIF ob =  new TNSIF("Task1");
        TNSIF ob1 =  new TNSIF("Task2");
        Thread T1 = new Thread(ob);
        Thread T2= new Thread(ob1);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MAX_PRIORITY);
        T1.start();
        T2.start();
    }
    
}

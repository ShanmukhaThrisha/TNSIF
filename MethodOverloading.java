class Product{
    public int Multiply(int a ,int b){
        int prod = a*b;
        return prod;
    }
    // method overloading with number of  parameters
    public int Multiply(int a, int b, int c){
        int prod = a*b*c;
        return prod;
    }
    // method overloading with different datatype
    public double Multiply(double a,double b){
        double prod = a*b;
        return prod;
    }
    public void data(String name, int roll_no){
        System.out.println("Name: "+name+"\nRollNo: "+roll_no);
    }
    //method Overloading with order of parameters 
    public void data(int roll_no, String name){
        System.out.println("Name: "+name+"\nRollNo: "+roll_no);
    }
}



public class MethodOverloading {
    public static void main(String[] args) {
      Product p = new Product();
      int a=  p.Multiply(2,3);
      int a1 = p.Multiply(5,10,15);
      double b =p.Multiply(2.5,3.5);
      System.out.println("Product of 2 and 3 is: "+a);
      System.out.println("product of 5,10 and 15 is: "+a1);
      System.out.println("product of 2.5 and 3.5 is: "+b);
      p.data("Harry",25);
      p.data(35,"Frankle");
    }
    
}

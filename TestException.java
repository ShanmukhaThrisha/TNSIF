public class TestException {
    static int divisionbyzero(int a,int b){
        int i = a/b;
        return i;
    }
    static int computedivision(int a ,int b){
        int res =0;
        try{
            res = divisionbyzero(a,b);
        }
        catch(NumberFormatException ex){
            System.out.println("NumberFormatException has occured");
        }
        return res;
    }
    public static void main(String[] args) {
        int a =11;
        int b =0;
        try{
            int i = computedivision(a, b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    
}

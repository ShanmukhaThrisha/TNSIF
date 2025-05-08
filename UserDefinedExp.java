class InvalidageException extends Exception{
    public InvalidageException(String m){
        super(m);
    }
}
public class UserDefinedExp {
   
        public static void validate(int age) throws InvalidageException {
            if (age<18){
                throw new InvalidageException("Age must be above 18 ");
            }
            System.out.println("Valid age: "+age);

        }
        public static void main(String[] args) {
        try{
            validate(12);
        }
        catch(InvalidageException e){
            System.out.println("Exception Caught");
            System.out.println(e.getMessage());
        }
    }

    
}

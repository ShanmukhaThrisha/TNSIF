public class strexample {
    public static void concat1(String s1){
        s1 = s1 +"Java String";
    }
    public static void concat2(StringBuilder s2){
        s2.append("Java String");
    }
    public static void concat3(StringBuffer s3){
        s3.append("Java String");
    }
    public static void main(String[] args) {
        // String Literal 
        String s1 = "This is a ";
        concat1(s1);
        System.out.println("String: "+s1);
        // String Builder
        StringBuilder s2 = new StringBuilder("This is a ");
        concat2(s2);
        System.out.println("StringBuilder: "+s2);
        //String Buffer
        StringBuffer s3 = new StringBuffer("This is a ");
        concat3(s3);
        System.out.println("StringBuffer: "+s3);
       
        
    }
}

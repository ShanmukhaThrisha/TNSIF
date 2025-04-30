public class Encapsulation{
private String name;
private int age;
private String issue;
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public String getIssue(){
    return issue;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}
public void setIssue(String issue){
    this.issue = issue;
}

}
class Doctor{
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Rahul");
        e.setAge(51);
        e.setIssue("Diabetics");
        System.out.println("Name of patient: "+e.getName());
        System.out.println("Age of patient: "+e.getAge());
        System.out.println("Health issue of patient: "+e.getIssue());
        
    }
   
}
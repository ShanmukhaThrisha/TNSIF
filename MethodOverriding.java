
 class Animal{
    public void moving(){
        System.out.println("Animal is moving");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    @Override public void moving(){
        System.out.println("Dog is moving");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}

public class MethodOverriding {
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.moving();
        d.bark();
        d.eat();

    }
}

public class _11overriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        a1.eat();
        d1.eat();
    }
}
class Animal {
    void eat(){
    System.out.println("animal");
}
}
class Dog extends Animal{
    void eat(){
    System.out.print("dog");
}
}

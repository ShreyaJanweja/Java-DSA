//abstract class
package OOPs;
abstract class animal{
    public abstract void sound();
}
class Dog extends animal{
    public void sound(){
        System.out.println("Dog is barking");
    }
}
class Lion extends animal{
    public void sound(){
        System.out.println("Lion is roar");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }
}

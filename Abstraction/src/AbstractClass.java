abstract class animal{
    animal(){
        System.out.println("All animals..");
    }
    public abstract void sound();
}
class dog extends animal{
    dog(){
        super();
    }
    public void sound(){
        System.out.println("Dog is Barking...");
    }
}
class lion extends animal{
    lion(){
        super();
    }
    public void sound(){
        System.out.println("Lion is Roar...");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        dog d=new dog();
        lion l=new lion();
        d.sound();
        l.sound();
    }
}

class test2{
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}
public class MethodOverriding {
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
    public static void main(String[] args) {
        MethodOverriding m=new MethodOverriding();
        m.eat();
    }
}

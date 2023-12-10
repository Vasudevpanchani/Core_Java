interface i{
    void show();
}
interface j{
    void show();
}
public class MultipleInheritance implements i,j{
    public void show(){
        System.out.println("Multiple Inheritance.");
    }
    public void disp(){
        System.out.println("display method.");
    }
    public static void main(String[] args) {
        MultipleInheritance m=new MultipleInheritance();
        m.show();
        m.disp();
    }
}

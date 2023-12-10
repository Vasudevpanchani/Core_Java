class P{
    void showP(){
        System.out.println("calling p...");
    }
}
public class SingleLevelInheritance extends P {
    void showB(){
        System.out.println("calling b...");
    }
    public static void main(String[] args) {
        SingleLevelInheritance obj=new SingleLevelInheritance();
        obj.showP();
        obj.showB();
    }
}

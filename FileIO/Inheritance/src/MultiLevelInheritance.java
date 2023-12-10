class A{
    void showA(){
        System.out.println("method A");
    }
}
class B extends A{
    void showB(){
        System.out.println("method B");
    }
}
public class MultiLevelInheritance extends B{
    void showC(){
        System.out.println("method C");
    }
    public static void main(String[] args) {
        MultiLevelInheritance obj=new MultiLevelInheritance();
        obj.showC();
        obj.showB();
        obj.showA();
    }
}

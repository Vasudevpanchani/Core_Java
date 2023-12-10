class R{
    void showR(){
        System.out.println("method R");
    }
}
class Q extends R{
    void showQ(){
        System.out.println("method Q");
    }
}
public class HierarchicalInheritance extends R{
    void showL(){
        System.out.println("method L");
    }
    public static void main(String[] args) {
        HierarchicalInheritance h=new HierarchicalInheritance();
        h.showR();
        h.showL();
        Q q=new Q();
        q.showQ();
        q.showR();
    }
}

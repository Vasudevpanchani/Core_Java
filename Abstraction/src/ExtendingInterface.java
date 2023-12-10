interface gill{
    void add();
}
interface raj extends gill{
    void sub();
}
class vasu implements raj{
    @Override
    public void add(){
        int a=10,b=20;
        System.out.println("Addition is:"+(a+b));
    }
    @Override
    public void sub(){
        int a=20,b=10;
        System.out.println("Subtraction is:"+(a-b));
    }
}
public class ExtendingInterface{
    public static void main(String[] args) {
        raj r=new vasu();
        r.add();
        r.sub();
    }
}

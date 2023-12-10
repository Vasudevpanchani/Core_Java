class m extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("vasudev");
        }
    }
}
public class ExtendingThreadClass {
    public static void main(String[] args) {
        m obj=new m();
        obj.start();
    }
}

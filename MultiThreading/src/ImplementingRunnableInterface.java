class n implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("panchani");
        }
    }
}
public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        n obj=new n();
        Thread t=new Thread(obj);
        t.start();
    }
}

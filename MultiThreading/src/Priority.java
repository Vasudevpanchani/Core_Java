class setpriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class Priority {
    public static void main(String[] args) {
        setpriority t1=new setpriority();
        setpriority t2=new setpriority();
        setpriority t3=new setpriority();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.setPriority(8);
        t2.setPriority(4);
        t3.setPriority(6);
        t1.start();
        t2.start();
        t3.start();
    }
}

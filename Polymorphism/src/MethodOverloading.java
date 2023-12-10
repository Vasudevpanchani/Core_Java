class test{
    void sum(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("sum is:"+c);
    }
    void sum(int a,int b){
        System.out.println("sum is:"+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("sum is:"+(a+b+c));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        test t=new test();
        t.sum();
        t.sum(10,20);
        t.sum(10,20,30);
    }
}

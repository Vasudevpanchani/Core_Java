class student{
    int x,y;
    student(int a,int b){
        x=a;
        y=b;
    }
    void show(){
        System.out.println(x+","+y);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        student s=new student(10,20);
        s.show();
    }
}

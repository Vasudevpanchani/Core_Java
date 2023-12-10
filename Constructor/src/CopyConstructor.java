class learning{
    int a;
    String s;
    learning(){
        a=10;
        s="learning";
        System.out.println(a+":"+s);
    }
    learning(learning ref){
        a=ref.a;
        s=ref.s;
        System.out.println(a+":"+s);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        learning obj1=new learning();
        learning obj2=new learning(obj1);
    }
}

class testencapsulation{
    private int value; //data hiding
    public void setValue(int x){ //data abstraction
        value=x;
    }
    public int getValue(){
        return value;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        testencapsulation obj=new testencapsulation();
        obj.setValue(56);
        System.out.println(obj.getValue());
    }
}

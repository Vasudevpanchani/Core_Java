class employee{
    int id;
    String name;
    employee(){
        id=1;
        name="vasudev";
    }
    void display(){
        System.out.println(id+":"+name);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        employee e=new employee();
        e.display();
    }
}

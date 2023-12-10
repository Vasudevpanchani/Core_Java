public class Operator {
    public static void main(String[] args) {
        int a=20,b=10;
        //Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulus:"+(a%b));
        System.out.println("Pre Increment:"+(++a));  //21
        System.out.println("Post Increment:"+(a++)); //21
        System.out.println("Pre Decrement:"+(--a));  //21
        System.out.println("Post Decrement:"+(a--)); //21

        //Assignment Operators
        System.out.println("Assignment Operators:");
        int x=20,y=10;
        System.out.println(x=y);
        System.out.println(x+=y);
        System.out.println(x-=y);
        System.out.println(x*=y);
        System.out.println(x/=y);

        //Relational/Comparison Operators
        int p=10,q=20;
        System.out.println("Comparison Operators:");
        System.out.println(p==q);
        System.out.println(p!=q);
        System.out.println(p<q);
        System.out.println(p>q);
        System.out.println(p<=q);
        System.out.println(p>=q);

        //Logical Operators
        System.out.println("Logical Operators:");
        int Z=4;
        System.out.println("AND:"+(Z < 5 &&  Z < 10));
        System.out.println("OR:"+(Z < 5 || Z < 4));
        System.out.println("NOT:"+!(Z < 5 && Z < 10));

        //Bitwise Operators
        int v=4,g=7;
        System.out.println("Bitwise Operators:");
        System.out.println("bitwise and:"+(v&g));
        System.out.println("bitwise or:"+(v|g));
        System.out.println("bitwise XOR:"+(v^g));
        System.out.println("1's Complement:"+(~v));
        System.out.println("Left shift:"+(v<<2));
        System.out.println("Right shift:"+(g>>2));
    }
}

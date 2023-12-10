import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new YoungerAgeException("you are not eligible for voting.");
            }else {
                System.out.println("you can vote successfully.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ended...");
    }
}

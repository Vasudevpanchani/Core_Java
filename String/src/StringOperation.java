public class StringOperation {
    static void reverse(String str){
        String rstr="";
        char ch;
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rstr=ch+rstr;
        }
        System.out.println(rstr);
    }
    static void truncate(String str,int index){
        String s= str.substring(0,index);
        System.out.println(s);
    }
    public static void main(String[] args) {
        //String str=new String("vasudev"); //immutable
        //StringBuffer sb=new StringBuffer("vasudev"); //mutable
        //StringBuilder sb=new StringBuilder("vasudev"); //mutable
        String str="Vasuaev";
        String str2="  Panchani  ";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(str2));
        reverse(str);
        truncate(str,5);
        System.out.println(str.length());
        System.out.println(str2.trim());
        System.out.println(str.replace('a','A'));
        System.out.println(str.startsWith("Va"));
        System.out.println(str.endsWith("ev"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('s'));
        System.out.println(str.substring(0));
        System.out.println(str.substring(1,5));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf('a',5));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

    }
}

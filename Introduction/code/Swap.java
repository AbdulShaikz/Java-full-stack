
public class Swap{
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        //Using Arithemetic
        /*a = a + b;
        b = a - b;
        a = a - b;*/

        //Using XoR
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("a: "+ a + " b: "+ b);
    }
}
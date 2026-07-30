import java.util.Scanner;

public class Diamond{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a level: ");
        int level = input.nextInt();
        for(int i=0;i<2*level;i++){
            for(int j=0;j<level;j++){
                if(i<level){
                    if(j<level-1-i){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");
                    }
                }else{
                    if(j<i-level){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}


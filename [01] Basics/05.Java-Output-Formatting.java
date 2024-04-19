import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
      
            for(int i=0; i<3; i++){
                String s1 = sc.next();
                int x = sc.nextInt();
                int g = s1.length();
              
                for(int j=0; j<15; j++){
                    if(j < g){
                        System.out.print(s1.charAt(j));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
              
                if(x < 10){
                    System.out.println("00" + x);
                }
                else if(x < 100){
                    System.out.println("0" + x);
                }
                else{
                    System.out.println(x);
                }
            }
            
            System.out.println("================================");

    }
}

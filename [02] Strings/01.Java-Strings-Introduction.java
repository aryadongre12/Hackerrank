import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length() + B.length());    // kength of String A and B combined
        
        if(A.compareTo(B) <= 0){                        // Lexicographic comparison of A and B
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
        char a = A.charAt(0);
        char b = B.charAt(0);
        
        a = Character.toUpperCase(a);                   // 1st character uppercase of both strings
        b = Character.toUpperCase(b);
        
        System.out.print(a + A.substring(1, A.length()) + " " + b + B.substring(1, B.length()));
    }
}

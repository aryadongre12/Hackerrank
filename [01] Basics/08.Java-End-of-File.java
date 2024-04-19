import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        // Read input until EOF (End of File) is reached
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(n + " " + line);
            n++;
        }
    }  
}

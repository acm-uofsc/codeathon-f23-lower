import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            
            int answer = y * z + x;
            System.out.println(answer);
        }
        
        scanner.close();
    }
}
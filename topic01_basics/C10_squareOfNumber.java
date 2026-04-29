package topic01_basics;

import java.util.Scanner;
public class C10_squareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sq = a*a;
        System.out.println("Square of number : " + sq);
        sc.close();
    }
    
}

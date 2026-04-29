package topic01_basics;

import java.util.Scanner;

public class C11_cubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int cube = a*a*a;
        System.out.println("cube of number : " +cube);
        sc.close();
    }
}

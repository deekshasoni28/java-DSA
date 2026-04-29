package topic01_basics;

import java.util.Scanner;
public class C09_inputFromUser {
    public static void main(String[] args) {
        System.out.print("Enter radius : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.1415 * r * r;
        System.out.println("Area of circle : "+ a);

        sc.close();
    }
}

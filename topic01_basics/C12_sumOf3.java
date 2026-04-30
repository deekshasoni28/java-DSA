package topic01_basics;
import java.util.Scanner;
public class C12_sumOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c;
        System.out.print("Enter three number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of 3 numbers : "+ sum);
        sc.close();
    }
}

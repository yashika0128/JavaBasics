package Lecture06Functions01;
import java.util.*;
public class findFactorialOfNumber {
    public static int Factorial(int n){
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial *=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        System.out.println("Factorial of "+ num + " is: "+ Factorial(num));

    }
}

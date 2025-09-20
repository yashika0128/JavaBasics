package Lecture06Functions01;
import java.util.*;
public class findFactorialOfNumber {
    public static int Factorial(int n){
        if(n<0){
            System.out.println("Invalid Input");
            return -1;
        }else{
            int factorial = 1;
            for(int i=n; i>0; i--){
                factorial *=i ;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        if(Factorial(num) != 0){
            System.out.println("Factorial of "+ num + " is: "+ Factorial(num));
        }

    }
}

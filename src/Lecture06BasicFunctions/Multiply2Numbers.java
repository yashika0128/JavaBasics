package Lecture06BasicFunctions;
import java.util.*;
public class Multiply2Numbers {
    public static int MultiplyNums(int a,int b){
        return a*b ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int f= sc.nextInt();
        int g= sc.nextInt();
        System.out.println("Multiplication of two numbers is: "+ MultiplyNums(f,g));
    }
}

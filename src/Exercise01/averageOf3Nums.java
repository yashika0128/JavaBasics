package Exercise01;
import java.util.*;
public class averageOf3Nums {

    public static int Average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        System.out.println("Average of " + a + ", "+b+ " and "+ c+ " is: "+ Average(a,b,c));

    }
}

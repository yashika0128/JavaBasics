package Lecture06Functions01;
import java.util.*;
public class printSumOf2Numbers {
    public static int SumOfNum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int d= sc.nextInt();

        System.out.println(SumOfNum(c,d));
    }
}

package Lecture05;
import java.util.*;
public class pattern14 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0; i<n; i++){
            //spaces
            for(int j= n-1; j>i; j--){
                System.out.print(" ");
            }
            // 1st star set
            for(int j= 0; j<i+1; j++){
                System.out.print("*");
            }
            // 2nd star set
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            //spaces
            for(int j= 0; j<i; j++){
                System.out.print(" ");
            }
            //1st star set
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            //2nd star set
            for(int j=n-1; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}

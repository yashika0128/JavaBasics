package Lecture05AdvancePatterns;
import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        //first half
        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<2*(n-(i+1)) ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n ; i>0; i--){
            //stars
            for(int j=n; j>n-i; j--){
                System.out.print("*");
            }
            //spaces
            for(int j=2*(n-i); j>0 ; j--){
                System.out.print(" ");
            }
            //stars
            for(int j=n; j>n-i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

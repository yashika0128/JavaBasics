package Lecture05;
import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0; i<n; i++){
            //spaces
            for(int j=n-(i+1); j>=0; j--){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

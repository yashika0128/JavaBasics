package Lecture05AdvancePatterns;
import java.util.*;
public class pattern13 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0; i<n; i++){
            //first half
            //spaces
            for(int j= n-(i+1); j>=0; j--){
                System.out.print(" ");
            }
            //numbers
            for(int j= i+1; j>0; j--) {
                System.out.print(j);
            }
            //second half
            for(int j=2; j<i+2; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

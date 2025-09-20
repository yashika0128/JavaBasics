package Lecture05AdvancePatterns;
import java.util.*;
public class pattern14AP2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int n= sc.nextInt();

        for(int i=0; i<n; i++){
            //space -> n- (i+1)
            for(int j= n-(i+1); j>0; j--){
                System.out.print(" ");
            }
            // stars -> 2*i+1
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>0; i--){
            //space -> n-i
            for(int j= n-i; j>0; j--){
                System.out.print(" ");
            }
            // stars -> 2*i-1
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package Lecture04;
import java.util.*;
public class pattern08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int num =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

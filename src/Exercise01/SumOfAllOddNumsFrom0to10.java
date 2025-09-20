package Exercise01;
import java.util.*;
public class SumOfAllOddNumsFrom0to10 {

    public static int SumOfOddNums(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i %2 !=0){
                sum +=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Sum of all the odd numbers from 1 to "+num+" is: "+ SumOfOddNums(num));
    }
}

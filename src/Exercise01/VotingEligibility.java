package Exercise01;
import java.util.*;
public class VotingEligibility {
    public static Boolean Voting(int age){
        if(age>=18){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int age= sc.nextInt();
        if(Voting(age) == Boolean.TRUE){
            System.out.println("Is eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}

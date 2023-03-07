package School;

/**
 * @author abuthair on 07/03/23.
 * 9:42 pm
 * @project GeeksForGeeks
 */
public class CheckArmStrong {
    static String armstrongNumber(int n) {
        int val =  n;
        int sum = 0;
        while(n != 0)
        {
            int rem = n % 10;
            sum+=rem*rem*rem;
            n = n/10;

    }
        if(sum == val){
            return "yes";
        }
        else{
            return "no";
        }
    }

}

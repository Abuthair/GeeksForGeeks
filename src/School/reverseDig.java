package School;

/**
 * @author abuthair on 07/03/23.
 * 10:00 pm
 * @project GeeksForGeeks
 */
public class reverseDig
{
    static int revDig(int N){
        int sum = 0;
        while(N != 0){
            int rem  = N % 10;
            sum= sum*10+rem;
            N = N/10;
        }
        return sum;
    }
}

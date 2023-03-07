package School;

/**
 * @author abuthair on 07/03/23.
 * 9:53 pm
 * @project GeeksForGeeks
 */
public class CountDigits {
    static int Count(int N){
        int sum =0;
        int val = N;
        while(N != 0){
            int rem = N % 10;
            if(rem != 0 && val % N == 0){
                sum++;
            }
            N=N/10;
        }
        return sum;
    }
}

package School;

import java.util.Scanner;

/**
 * @author abuthair on 08/03/23.
 * 10:19 pm
 * @project GeeksForGeeks
 */
public class SumOfDigits {
    static  int sum(int N){
        int sum = 0;
        while(N != 0){
            int rem = N % 10 ;
            sum+=rem;
            N=N/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((sum(N)));
    }
}

package School;

import java.util.Scanner;

/**
 * @author abuthair on 07/03/23.
 * 9:27 pm
 * @project GeeksForGeeks
 */
public class SumOfArray {

        public long getSum(long a[], long n)
        {
            long sum = 0;
            for(int i = 0 ; i < a.length;i++){
                sum =sum+a[i];
            }
            return sum;
        }
    }


package School;

/**
 * @author abuthair on 07/03/23.
 * 10:11 pm
 * @project GeeksForGeeks
 */
public class SumNumAndCheckPalindrom {
    int isDigitSumPalindrome(int N) {

        int tem = N;

        int sum =0;

        while(tem>0){

            int digit = tem%10;

            sum = sum + digit;

            tem = tem/10;

        }

        int reverse=0;

        int temsum = sum;

        while(temsum>0){

            int digit = temsum%10;

            reverse=reverse*10+digit;

            temsum = temsum/10;

        }

        if(sum==reverse){

            return 1;

        }

        return 0;



    }

}

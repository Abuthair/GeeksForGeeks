package School;

import java.util.Scanner;

/**
 * @author abuthair on 08/03/23.
 * 10:01 pm
 * @project GeeksForGeeks
 */
public class FindOddOrEven {
    static String FindOddOrEven(int N){
        if(N % 2 != 0){
            return "Odd";
        }
        else{
            return "Even";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = FindOddOrEven(N);
        System.out.println("ans = " + ans);
    }
}

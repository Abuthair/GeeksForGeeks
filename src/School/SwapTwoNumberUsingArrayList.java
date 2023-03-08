package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author abuthair on 08/03/23.
 * 10:10 pm
 * @project GeeksForGeeks
 */
public class SwapTwoNumberUsingArrayList {
    static List<Integer> SwapTwoNum(int a ,int b){
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(b);
        list.add(a);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((SwapTwoNum(a,b)));
    }
}

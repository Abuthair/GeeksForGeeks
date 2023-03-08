package School;

/**
 * @author abuthair on 08/03/23.
 * 9:39 pm
 * @project GeeksForGeeks
 */
public class GCD_OR_HCD {
    //Brute Force
    //TimeComplexity O(N)
    //SpaceComplexity O(1)
    static int FindGCD(int A,int B){
        //Find Mini

        int Mini  = 0,GCD =0 ;
        if(A < B){
            Mini  = A;
        }
        else{
            Mini = B;
        }
        for (int i = 1; i <= Mini ; i++) {
            if(A % i == 0 && B % i == 0){
                GCD = i;
            }

        }
        return GCD;
    }
    //OPTIMISATION
    //TimeComplexity O(1)
    //SpaceComplexity O(1)

    static  int FindHCD(int C , int D){
        while(C % D != 0){
            int rem = C % D;
            C = D;
            D =rem;
        }
        return D;
    }

}

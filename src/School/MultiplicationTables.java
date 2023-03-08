package School;

import java.util.ArrayList;

/**
 * @author abuthair on 08/03/23.
 * 9:24 pm
 * @project GeeksForGeeks
 */
public class MultiplicationTables {
    static ArrayList<Integer> getTables(int N){
        ArrayList<Integer> tables = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            tables.add(N*i);
        }
        return tables;
    }
}

package FizzBuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzEngine {

    public static List fizzBuzzGame(int n) throws Exception {
        List list = FizzBuzzListFactory.listFactory(n);
        for(int i=0; i<list.size(); i++ ){
            if(list.get(i).equals(3)) {
                String convertValue = FizzBuzzConvert.convert((Integer) list.get(i));
                list.set(i,convertValue);
            }
        }
        return list;
    }
}

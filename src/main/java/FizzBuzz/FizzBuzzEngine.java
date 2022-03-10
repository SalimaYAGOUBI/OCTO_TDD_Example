package FizzBuzz;

import javax.swing.text.html.parser.Parser;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzEngine {

    public static List fizzBuzzGame(int n) throws Exception {
        List list = FizzBuzzListFactory.listFactory(n);
        for(int i=0; i<list.size(); i++ ){
            if( list.get(i).hashCode()%3 == 0| list.get(i).equals(5) ) {
                String convertValue = FizzBuzzConvert.convert((Integer) list.get(i));
                list.set(i,convertValue);
            }
        }
        return list;
    }
}

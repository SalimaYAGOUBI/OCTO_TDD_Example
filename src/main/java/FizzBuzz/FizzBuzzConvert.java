package FizzBuzz;

public class FizzBuzzConvert {

    public static String convert(int i) throws Exception {
        if ( (i%3 == 0) && (i%5 == 0) ) return "FizzBuzz";
        else if( i % 3 == 0) return "Fizz";
        else if( i % 5 == 0) return "Buzz";
        else throw new Exception("not multiple 3 or 5");
    }
}

package FizzBuzz;

public class FizzBuzzConvert {

    public static String convert(int i) {
        if ( (i%3 == 0) && (i%5 == 0) )return "FizzBuzz";
        else if( i % 3 == 0) return "Fizz";
        else return "Buzz";
    }
}

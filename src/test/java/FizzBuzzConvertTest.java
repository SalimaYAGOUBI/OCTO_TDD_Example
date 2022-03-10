import FizzBuzz.FizzBuzzConvert;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConvertTest {

    @Test
    public void ShouldReturnFizzWhenGiven3(){
        FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();
        String result = FizzBuzzConvert.convert(3);
        Assert.assertEquals("Fizz",result);
    }
}

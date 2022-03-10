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
    @Test
    public void ShouldReturnBuzzWhenGiven5(){
        FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();
        String result = FizzBuzzConvert.convert(5);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void ShouldReturnFizzWhenGivenMultiple3(){
        FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();
        String result = FizzBuzzConvert.convert(6);
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void ShouldReturnBuzzWhenGivenMultiple5(){
        FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();
        String result = FizzBuzzConvert.convert(10);
        Assert.assertEquals("Buzz",result);
    }
    @Test
    public void ShouldReturnFizzBuzzWhenGivenMultiple3And5(){
        FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();
        String result = FizzBuzzConvert.convert(15);
        Assert.assertEquals("FizzBuzz",result);
    }
}

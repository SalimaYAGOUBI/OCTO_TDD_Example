import FizzBuzz.FizzBuzzConvert;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConvertTest {

    FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();


    @Test
    public void ShouldReturnFizzWhenGiven3() throws Exception {
        String result = FizzBuzzConvert.convert(3);
        Assert.assertEquals("Fizz",result);
    }
    @Test
    public void ShouldReturnBuzzWhenGiven5() throws Exception{
        String result = FizzBuzzConvert.convert(5);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void ShouldReturnFizzWhenGivenMultiple3() throws Exception{
        String result = FizzBuzzConvert.convert(6);
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void ShouldReturnBuzzWhenGivenMultiple5() throws Exception{
        String result = FizzBuzzConvert.convert(10);
        Assert.assertEquals("Buzz",result);
    }
    @Test
    public void ShouldReturnFizzBuzzWhenGivenMultiple3And5() throws Exception{
        String result = FizzBuzzConvert.convert(15);
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test(expected = Exception.class)
    public void ShouldReturnExceptionWhenGivenNoMultiple3And5() throws Exception{
        FizzBuzzConvert fizzBuzzConvert = new FizzBuzzConvert();
        String result = FizzBuzzConvert.convert(7);
    }
}

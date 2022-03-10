import FizzBuzz.FizzBuzzListFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzListFactoryTest {

    @Test
    public void ShouldReturnListWith1WhenGiven1(){
        List expectedList = Arrays.asList(1);
        List actualList = FizzBuzzListFactory.listFactory(1);
        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void ShouldReturnListWith1And2WhenGiven2(){
        List expectedList = Arrays.asList(1,2);
        List actualList = FizzBuzzListFactory.listFactory(2);
        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void ShouldReturnListWithElementFrom1To6WhenGiven6(){
        List expectedList = Arrays.asList(1,2,3,4,5,6);
        List actualList = FizzBuzzListFactory.listFactory(6);
        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void ShouldReturnListWithElementFrom1To15WhenGiven15(){
        List expectedList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List actualList = FizzBuzzListFactory.listFactory(15);
        Assert.assertEquals(expectedList,actualList);
    }
}


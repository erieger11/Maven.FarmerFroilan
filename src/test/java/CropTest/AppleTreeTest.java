package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class AppleTreeTest {

    @Test

    @Test
    public void testInheritance(){
        Apple apple = new Apple();
        Assert.assertTrue(apple instanceof Crop);
    }
}

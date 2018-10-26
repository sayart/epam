import org.junit.Assert;
import org.junit.BeforeClass;
import  org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTemperatureConverter {
    public static TemperatureConverter converter;
    @Parameterized.Parameter
    public double celcium;
    @Parameterized.Parameter(1)
    public double kelvin;
    @Parameterized.Parameter(2)
    public double farengeit;

//    public TestTemperatureConverter(double celcium, double kelvin, double farengeit) {
//        this.celcium = celcium;
//        this.farengeit = farengeit;
//        this.kelvin = kelvin;
//    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {
            {0.0, 273.15, 32.0},
            {-100.0, 173.15, -148.0},
            {-273.15, 0.0, -459.67},
            {273.15, 546.3, 523.67}
        });
    }

    @BeforeClass
    public static void init(){
        converter = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC(){
        double result = converter.convertFtoC(farengeit);
        Assert.assertEquals(celcium, result, 0.0001);
    }
    @Test
    public void testConvertCtoF(){
        double result = converter.convertCtoF(celcium);
        Assert.assertEquals(farengeit, result, 0.0001);
    }
    @Test
    public void testConvertCtoK(){
        double result = converter.convertCtoK(celcium);
        Assert.assertEquals(kelvin, result, 0.0001);
    }
    @Test
    public void testConvertKtoC(){
        double result = converter.convertKtoC(kelvin);
        Assert.assertEquals(celcium, result, 0.0001);
    }
    @Test
    public void testConvertFtoK(){
        double result = converter.convertFtoK(farengeit);
        Assert.assertEquals(kelvin, result, 0.0001);
    }

    @Test
    public void testConvertKtoF(){
        double result = converter.convertKtoF(kelvin);
        Assert.assertEquals(farengeit, result, 0.0001);
    }



}

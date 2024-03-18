import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ShapeTest {
    @Test
    void ShapeByNumberTest(){
        ShapeFactory shape1 = new ShapeFactory(18);
        Assertions.assertEquals(Color.RED,shape1.paint);
        ShapeFactory shape2 = new ShapeFactory(77);
        Assertions.assertEquals(GradientPaint.class, shape2.paint.getClass());
    }
    @Test
    void simpleTest(){
        Assertions.assertEquals(4,(2+2));
        Assertions.assertTrue(5>3);
        Assertions.assertFalse(5<3);
        Assertions.assertThrows(ArithmeticException.class,()->expression(2,0));
    }

    int expression(int a, int b)throws ArithmeticException{
        return a/b;
    }
}

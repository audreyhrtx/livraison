import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import livraison.FoodFastUtils;

public class FoodFastUtilsTest {

    @Test
    void testDeliveryPlanner() {
        assertEquals("fizz", FoodFastUtils.deliveryPlanner(3));
        assertEquals("buzz", FoodFastUtils.deliveryPlanner(5));
        assertEquals("fizzbuzz", FoodFastUtils.deliveryPlanner(15));
        assertEquals("", FoodFastUtils.deliveryPlanner(7));
    }
}

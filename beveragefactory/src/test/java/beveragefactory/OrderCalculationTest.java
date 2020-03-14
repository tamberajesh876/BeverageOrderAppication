package beveragefactory;

import org.junit.Test;
import com.beveragefactory.order.OrderCalculation;

public class OrderCalculationTest {

	protected OrderCalculation orderCalculation = new OrderCalculation();

	@Test
	public void testOrderCalculation() {
		OrderCalculation.main(new String[] { "Chai", "Coffee,-milk", "Chai ,-sugar", "Chai ,-sugar,-milk" });
	}

	@Test
	public void testThrowExceptionIfNumber() {
		OrderCalculation.main(new String[] { "Chai1", "Coffee,-milk", "Chai ,-sugar", "Chai ,-sugar,-milk" });
	}

	@Test
	public void testThrowExceptionIfAllIngredientsExcluded() {
		OrderCalculation.main(new String[] { "Chai", "Coffee,-milk", "Chai ,-sugar", "Chai ,-sugar,-milk",
				"Coffee,-Coffee,-milk,-sugar,-water" });
	}
}

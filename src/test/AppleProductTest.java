import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AppleProductTest {

	private final String model = "IPHONE SE";
	private final String screen = "4";
	private final String processor = "A9";
	private final String modem = "CDMA";
	private final String color = "SILVER";
	private final String memory = "16GB";
	private final String touchTechnology = "FALSE";
	private final String price = "490";
	
	private AppleProduct test = new Iphone("IPHONE SE" , "4", "A9", "CDMA", "SILVER", "16GB", false, 490);
	private AppleProduct test2 = new Iphone("IPHONE 7" , "4.7", "A10", "GSM", "JET BLACK", "32GB", true, 700);
	private AppleProduct same_as_test = new Iphone("IPHONE SE" , "4", "A9", "CDMA", "SILVER", "16GB", false, 490);
	

	@Test
	public void testRead() {

		String file = model + ", " + screen + ", " + processor + ", " + modem + ", " + color + ", " + memory + ", " + touchTechnology + ", " + price + "\n";
		Scanner input = new Scanner(file);
		
		assertEquals(AppleProduct.read(input), test);
		input.close();
	}


	@Test
	public void testEqualsObject() {
		assertEquals(test, same_as_test);
	}
	@Test
	public void testNotEqualsObject() {
		assertNotEquals(test, test2);
	}
	
	@Test
	public void testNullObject() {
		assertNotEquals(test, null);
	}


}

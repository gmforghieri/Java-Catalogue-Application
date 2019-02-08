import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class IpadTest {

	private Ipad test = new Ipad("IPAD AIR 2" , "9.7", "A8", true, "SILVER", "64GB",  400);
	private Ipad test2 = new Ipad("IPAD PRO" , "9.7", "A9", true, "SPACE GREY", "32GB",  650);
	private Ipad same_as_test = new Ipad("IPAD AIR 2" , "9.7", "A8", true, "SILVER", "64GB",  400);
	
	@Test
	void testStringOriginal() {
		assertEquals(test.stringOriginal(), "IPAD AIR 2, 9.7, A8, TRUE, SILVER, 64GB, 400\n");
	}

	@Test
	void testEqualsObject() {
		assertEquals(test, same_as_test);
	}
	@Test
	void testNotEqualsObject() {
		assertNotEquals(test, test2);
	}
	@Test
	void testNullObject() {
		assertNotEquals(test, null);
	}

	@Test
	void testToString() {
	     assertEquals(test.toString(), "Apple IPAD AIR 2 with 64GB of memory\n" + 
	     		"     with an A8 processor and 9.7 inch screen\n" + 
	     		"     having WiFi and 4G technology\n" + 
	     		"     400 euros\n");
	}

	@Test
	void testGetWifi() {
		assertEquals(test.getWifi(), "TRUE");
	}

}

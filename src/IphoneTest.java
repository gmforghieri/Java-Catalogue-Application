import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;



class IphoneTest {

	private Iphone test = new Iphone("IPHONE SE" , "4", "A9", "CDMA", "SILVER", "16GB", false, 490);
	private Iphone test2 = new Iphone("IPHONE 7" , "4.7", "A10", "GSM", "JET BLACK", "32GB", true, 700);
	private Iphone same_as_test = new Iphone("IPHONE SE" , "4", "A9", "CDMA", "SILVER", "16GB", false, 490);

	@Test
	public void testStringOriginal() {
		assertEquals(test.stringOriginal(), "IPHONE SE, 4, A9, CDMA, SILVER, 16GB, FALSE, 490\n");
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

	@Test
	public void testToString() {
		assertEquals(test.toString(), "Apple IPHONE SE with 16GB of memory\n" + 
				"     with an A9 processor and 4 inch screen\n" + 
				"     490 euros\n");
	}

	@Test
	public void testGetModem() {
		assertEquals(test.getModem(), "CDMA");
	}


}

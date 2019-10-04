import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IpadTest {

	private Ipad test = new Ipad("IPAD AIR 2" , "9.7", "A8", true, "SILVER", "64GB",  400);
	private Ipad test2 = new Ipad("IPAD PRO" , "9.7", "A9", true, "SPACE GREY", "32GB",  650);
	private Ipad same_as_test = new Ipad("IPAD AIR 2" , "9.7", "A8", true, "SILVER", "64GB",  400);
	
	@Test
	public void testStringOriginal() {
		assertEquals(test.stringOriginal(), "IPAD AIR 2, 9.7, A8, TRUE, SILVER, 64GB, 400\n");
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
	     assertEquals(test.toString(), "Apple IPAD AIR 2 with 64GB of memory\n" + 
	     		"     with an A8 processor and 9.7 inch screen\n" + 
	     		"     having WiFi and 4G technology\n" + 
	     		"     400 euros\n");
	}

	@Test
	public void testGetWifi() {
		assertEquals(test.getWifi(), "TRUE");
	}

}

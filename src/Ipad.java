import java.util.Scanner;

public class Ipad extends AppleProduct{
	private boolean wifi;
	
	/**
	 * @param model
	 * @param screen
	 * @param processor
	 * @param wifi
	 * @param color 
	 * @param memory
	 * @param price
	 */
	public Ipad(String model, String screen, String processor,boolean wifi, String color, String memory, int price) {
		super(model, screen, processor, color, memory, price);
		this.wifi = wifi;
	}
	
	public static void main(String[] args) {
//		Ipad test = new Ipad("Ipad Air 2", "4.7", "A10", "false", "Jet Black", "32GB", "700");
//		System.out.println(test);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(read(input).stringOriginal());
		System.out.println(read(input).toString());
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Apple " + getModel() + " with " + getMemory() + " of memory\n" + 
				"     with an " + getProcessor() + " processor and " + getScreen() + " inch screen\n" +
				"     having " + getInternet(wifi) + "\n" + 
				"     " + getPrice() + " euros\n";
	}
	/* (non-Javadoc)
	 * @see AppleProduct#stringOriginal()
	 */
	public String stringOriginal() {
		return getModel() + ", " + getScreen() + ", " + getProcessor() + ", " + getWifi() + ", " + getColor() + ", " + getMemory() + ", " +  getPrice() + "\n";
	}
	
	/**
	 * @param wifi
	 * @return
	 */
	public static String getInternet(boolean wifi) {
		String wifid = Boolean.toString(wifi);
		String internet = "";
		if(wifid.equals("true")) {
			internet = "WiFi and 4G technology";
		}
		else if(wifid.equals("false")) {
			internet = "WiFi only";
		}
		return internet;
	}
	
	/**
	 * @return
	 */
	public String getWifi() {
		String wifid = Boolean.toString(wifi).toUpperCase();
		return wifid;
	}
	
	/* (non-Javadoc)
	 * @see AppleProduct#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ipad other = (Ipad) obj;
		if (wifi != other.wifi)
			return false;
		return true;
	}
	
}

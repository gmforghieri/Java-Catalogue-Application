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
	Ipad(String model, String screen, String processor, boolean wifi, String color, String memory, int price) {
		super(model, screen, processor, color, memory, price);
		this.wifi = wifi;
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
	private static String getInternet(boolean wifi) {
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
	String getWifi() {
		return Boolean.toString(wifi).toUpperCase();
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
		return wifi == other.wifi;
	}
}

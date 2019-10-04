public class Iphone extends AppleProduct {
	private String modem;
	private boolean touchTechnology;
	
	/**
	 * @param model
	 * @param screen
	 * @param processor
	 * @param modem
	 * @param color
	 * @param memory
	 * @param touchTechnology
	 * @param price
	 */
	public Iphone(String model, String screen, String processor, String modem, String color, String memory,boolean touchTechnology, int price) {
		super(model, screen, processor, color, memory, price);
		this.modem = modem;
		this.touchTechnology = touchTechnology;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Apple " + getModel() + " with " + getMemory() + " of memory\n" + 
				"     with an " + getProcessor() + " processor and " + getScreen() + " inch screen\n" +
				"     " + getPrice() + " euros\n";
	}
	
	/* (non-Javadoc)
	 * @see AppleProduct#stringOriginal()
	 */
	public String stringOriginal() {
		return getModel() + ", " + getScreen() + ", " + getProcessor() + ", " + getModem() + ", " + getColor() + ", " + getMemory() + ", " + getTouchTechnology() + ", " +  getPrice() + "\n";
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
		Iphone other = (Iphone) obj;
		if (modem == null) {
			if (other.modem != null)
				return false;
		} else if (!modem.equals(other.modem))
			return false;
		return touchTechnology == other.touchTechnology;
	}
	
	/**
	 * @return
	 */
	String getModem() {
		return modem.toUpperCase();
	}


	/**
	 * @return
	 */
	private String getTouchTechnology() {
		return Boolean.toString(touchTechnology).toUpperCase();
	}



}

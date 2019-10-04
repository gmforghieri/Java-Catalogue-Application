import java.util.Scanner;

public abstract class AppleProduct {
	private String model;
	private String screen;
	private String processor;
	private String color;
	private String memory;
	private int price;

	/**
	 * @param model
	 * @param screen
	 * @param processor
	 * @param color
	 * @param memory
	 * @param price
	 */
	public AppleProduct(String model, String screen, String processor, String color, String memory, int price) {
		this.model = model;
		this.screen = screen;
		this.processor = processor;
		this.color = color;
		this.memory = memory;
		this.price = price;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(read(input).stringOriginal());

	}

	/**
	 * @param sc
	 * @return
	 */
	public static AppleProduct read(Scanner sc) {
		String input = sc.nextLine();

		String[] whole = input.split(", ");

		String model = whole[0];
		String screenSize = whole[1];
		String processor = whole[2];

		String modem = "";
		String internet = "";
		if (model.contains("IPHONE")) {
			modem = whole[3];
		} else {
			internet = whole[3];
		}

		String color = whole[4];
		String memory = whole[5];

		String touchTechnology;
		int price;
		if (model.contains("IPHONE")) {
			touchTechnology = whole[6];
			boolean touch = Boolean.parseBoolean(touchTechnology);
			price = Integer.parseInt(whole[7]);
			AppleProduct scannedAppleProduct = new Iphone(model, screenSize, processor, modem, color, memory,
					touch, price);
			return scannedAppleProduct;
		} else {
			price = Integer.parseInt(whole[6]);
			boolean wifi = Boolean.parseBoolean(internet);
			AppleProduct scannedAppleProduct = new Ipad(model, screenSize, processor, wifi, color, memory, price);
			return scannedAppleProduct;
		}

	}

	/**
	 * @return
	 */
	public String stringOriginal() {
		return "" + getModel() + getMemory() + getProcessor() + getScreen() + getPrice();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppleProduct other = (AppleProduct) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (screen == null) {
			if (other.screen != null)
				return false;
		} else if (!screen.equals(other.screen))
			return false;
		return true;
	}

	/**
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return
	 */
	public String getScreen() {
		return screen;
	}

	/**
	 * @return
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @return
	 */
	public int getPrice() {
		return price;
	}

}

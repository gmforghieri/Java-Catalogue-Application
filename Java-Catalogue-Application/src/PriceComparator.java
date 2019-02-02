import java.util.Comparator;

public class PriceComparator implements Comparator<AppleProduct> {

	@Override
	public int compare(AppleProduct device0, AppleProduct device1) {
		return (device0.getPrice() - device1.getPrice());
	}

}

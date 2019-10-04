import java.util.Comparator;

public class ProductComparator implements Comparator<AppleProduct> {

	@Override
	public int compare(AppleProduct device0, AppleProduct device1) {

		return device0.getModel().compareTo(device1.getModel());
	}
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gian Marco
 *
 */
public class AppleCatalog {
	private List<AppleProduct> catalog;
	
	/**
	 * 
	 */
	private AppleCatalog() {
		this.catalog = new ArrayList<AppleProduct>();
	}
	
	/**
	 * @param appleproduct to be added
	 */
	void addProduct(AppleProduct appleproduct) {
		catalog.add(appleproduct);
	}
	
	/**
	 * @param input is a Scanner object
	 * @return an AppleCatalog
	 */
	static AppleCatalog read(Scanner input) {
		AppleCatalog scannedCatalog = new AppleCatalog();
		
			while(input.hasNextLine()) {
				AppleProduct scanned = AppleProduct.read(input);
				scannedCatalog.addProduct(scanned);
			}

		return scannedCatalog;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + catalog;
	}
	
	/**
	 * @return a list of Apple products
	 */
	List<AppleProduct> getCatalog() {
		return catalog;
	}

	
}

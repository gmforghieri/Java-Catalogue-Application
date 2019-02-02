import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gian Marco
 *
 */
public class AppleCatalog {
	List<AppleProduct> catalog;
	
	/**
	 * 
	 */
	public AppleCatalog() {
		this.catalog = new ArrayList<AppleProduct>();
	}
	
	/**
	 * Add
	 * @param appleproduct
	 */
	public void addProduct(AppleProduct appleproduct) {
		catalog.add(appleproduct);
	}
	
	/**
	 * @param file
	 * @return
	 */
	public static AppleCatalog read(Scanner input) {
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
	 * @return
	 */
	public List<AppleProduct> getCatalog() {
		return catalog;
	}

	
}

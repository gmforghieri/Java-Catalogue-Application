import java.util.Collections;
import java.util.Comparator;

public class Worker implements Runnable {

	private Thread worker;
	private AppleCatalog fullCatalog;
	private Comparator<AppleProduct> comparator;
	
	// Testing if the thread is running, to make sure I do not add another iPhone or iPad while the thread is running
	public boolean isActive() {
		return worker.isAlive();
	}

	public Worker(AppleCatalog fullCatalog) {
		worker = new Thread(this);
		this.fullCatalog = fullCatalog;
		
	}
	
	public synchronized void sortByPrice() {
		comparator = new PriceComparator();
		worker = new Thread(this);
		worker.start();
	}
	
	public synchronized void sortByName() {
		comparator = new ProductComparator();
		worker = new Thread(this);
		worker.start();
	}
	

	/**
	 * The thread's functionality should be described under the run() method
	 */
	public void run() {
		Collections.sort(fullCatalog.getCatalog(), comparator);
		System.out.print("\n ## THE THREAD IS DONE WITH IT'S TASK ##\n" + fullCatalog.toString().replace("[", "").replace("]", "").replace(", ", ""));
		
	}

}

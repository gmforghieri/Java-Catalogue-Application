import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File("apple.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Scanner inputScanner = new Scanner(System.in);
		int input;
		
		AppleCatalog scannedCatalog = AppleCatalog.read(inputFile);
		
		Worker sorter = new Worker(scannedCatalog);
		
		do {
			
			System.out.println("1 - Show entire Apple catalogue");
			System.out.println("2 - Add a new Iphone");
			System.out.println("3 - Add a new Ipad");
			System.out.println("4 - Show the entire catalogue sorted by product");
			System.out.println("5 - Show the entire Apple catalogue sorted by price(low -> high)");
			System.out.println("6 - Write to file");
			System.out.println("7 - Stop the program");
			
			input = Integer.parseInt(inputScanner.nextLine());
			
			if(input == 1) {
				
				System.out.println(scannedCatalog.toString().replace("[", "").replace("]", "").replace(", ", ""));
				}
			
			else if((input == 2) || (input == 3)) {
				System.out.println("Please enter the model:");
				String model = inputScanner.nextLine();
				System.out.println("Please enter the size of the screen in inches:");
				String screenSize = inputScanner.nextLine();
				System.out.println("Please enter the name of the processor:");
				String processor = inputScanner.nextLine();
				System.out.println("Please enter the color of the device:");
				String color = inputScanner.nextLine();
				System.out.println("Please enter the amount of memory the device has:");
				String memory = inputScanner.nextLine();
				System.out.println("Please enter the price:");
				int price = Integer.parseInt(inputScanner.nextLine());
				
				
				if(input == 2) {
					
					System.out.println("What is the type of modem(GSM or CDMA)?");
					String modem = inputScanner.nextLine();
					
					System.out.println("Does the Iphone have 3D touch technology(TRUE/FALSE)?");
					String touch = inputScanner.nextLine();
					
					boolean touchd = Boolean.parseBoolean(touch);
					
					AppleProduct temp = new Iphone(model, screenSize, processor, modem, memory, color, touchd, price);
					scannedCatalog.addProduct(temp);
					
					
				}
				else {
					
					System.out.println("Does the Ipad have 4G Technology(TRUE/FALSE)?");
					String wifi = inputScanner.nextLine();
					
					boolean wifid = Boolean.parseBoolean(wifi);
					
					AppleProduct temp = new Ipad(model, screenSize, processor, wifid, color, memory, price);
					scannedCatalog.addProduct(temp);
					
				}
				System.out.println("Device successfully added to the catalogue");
				}
			else if(input == 4) {
				sorter.sortByName();
				}
			else if(input == 5) {
				sorter.sortByPrice();
				}
			else if(input == 6) {
				
				try (Writer writer = new BufferedWriter(new FileWriter("ExtendedProductList.txt"))) {
					
					for(AppleProduct temp : scannedCatalog.getCatalog()) {
						String product = temp.stringOriginal();
						writer.write(product);
					}
					writer.close();
					
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				System.out.println("Writing to file has been completed successfully under the name ExtendedProductList");
			}
			else if (input > 7){
				System.out.println("Not a valid input");
				inputScanner.close();	
				throw new IllegalArgumentException();
			}
		} while(input < 7);
			
	}
}
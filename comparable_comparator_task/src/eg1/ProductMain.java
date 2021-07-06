package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(100, "dell","laptop", 56234.22, 2.3f));
		productList.add(new Product(200, "samsung", "mobile", 15677.22, 4.3f));
		productList.add(new Product(300, "hp", "laptop", 62999.22, 1.3f));
		productList.add(new Product(400, "dell", "laptop", 42999.22, 2.3f));
		productList.add(new Product(500, "dell", "mouse", 1202.22, 2.3f));
		productList.add(new Product(600, "lenovo", "charger", 122.22, 4.3f));
		productList.add(new Product(700, "hp", "laptop", 42999.22, 3.3f));

		System.out.println("Printing all the buses");
		printProductList(productList);
		
		Collections.sort(productList);
		
		System.out.println("\n\nPrinting all the buses sorted based on BusId(descending)");
		printProductList(productList);
		
		Collections.sort(productList,new ProductNameComparator());
		System.out.println("\n\nPrinting all the products sorted based on product manufactureName(ascending)");
		printProductList(productList);
		
		Collections.sort(productList,(Product p1,Product p2)->{
			Double d1=p1.getCost();
			Double d2=p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all the products sorted based on product Cost(ascending)");
		printProductList(productList);
		
		Collections.sort(productList,(Product p1,Product p2)->{
			int x=0;
			Float f1=p1.getRatings();
			Float f2=p2.getRatings();
			x=f2.compareTo(f1);
			if(x==0) {
			Double d1=p1.getCost();
			Double d2=p2.getCost();
			x= d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the product sorted based on product Rating(descending) and if 2 or more buses have same rating then by cost(ascending)");
		printProductList(productList);
	}
	
	
	
	private static void printProductList(List<Product> productList) {
		// TODO Auto-generated method stub
		
	}



	public static void printBusList(List<Product> productList) {
		Iterator<Product> i=productList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}


}



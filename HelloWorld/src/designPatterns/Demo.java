package designPatterns;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws Exception {
		//Journal,JournalPersistence
		/*
		Journal J = new Journal();
		J.addEntry("Crying today");
		J.addEntry("Went to School");
		System.out.println(J);
		
		JournalPersistence pJ = new JournalPersistence();
		String filename = "Journal.txt";
		pJ.saveToFile(J, filename, true);
		*/
		
		//Product, ProductFilter, Color, Size
		Product apple = new Product("Apple",Color.GREEN,Size.SMALL);
		Product tree = new Product("Tree",Color.GREEN,Size.LARGE);
		Product house = new Product("House", Color.RED, Size.LARGE);
		
		//Unmodifiable list of the products is created
		List<Product> products = List.of(apple, tree, house);
		
		ProductFilter prodFilter1 = new ProductFilter();
		System.out.println("List of Green Products");
		prodFilter1.filterByColor(products, Color.GREEN)
					.forEach(p -> System.out.println(
							" - " + p.name + " is green"));
		
		//BetterFilter
		BetterFilter bFilter = new BetterFilter();
		System.out.println("New implementation of green products :");
		bFilter.filter(products, new ColorSpecification(Color.GREEN))
				.forEach(p -> System.out.println(" - " + p.name +" is green"));
		
		System.out.println("Large Red item : ");
		bFilter.filter(products, new AndSpecification<>(
								new SizeSpecification(Size.LARGE),
								new ColorSpecification(Color.RED)))
				.forEach(p -> System.out.println(" - " + p.name + " is LARGE and RED"));
	}

}

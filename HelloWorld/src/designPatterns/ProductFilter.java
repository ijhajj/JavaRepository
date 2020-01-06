package designPatterns;

import java.util.stream.Stream;
import java.util.List;

//Whenever we make a new filter, we will need to jump into this class and add a new criteria
public class ProductFilter {
	public Stream<Product> filterByColor(List<Product> products, Color color){
		return products.stream().filter(p -> p.color == color);
	}
	public Stream<Product> filterBySize(List<Product> products,Size size){
		return products.parallelStream().filter(p -> p.size == size);
	}
	public Stream<Product> filterBySizeAndColor(List<Product> products,Size size,Color color){
		return products.parallelStream().filter(p -> p.size == size && p.color == color);
	}

}

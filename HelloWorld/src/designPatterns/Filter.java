package designPatterns;
import java.util.stream.Stream;
import java.util.List;


public interface Filter<T> {
	Stream<T> filter(List<T> items,Specification<T> spec);
}

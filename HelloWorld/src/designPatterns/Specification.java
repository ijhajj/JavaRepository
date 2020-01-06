package designPatterns;

public interface Specification<T> {
	boolean isSatisfied(T item);
}

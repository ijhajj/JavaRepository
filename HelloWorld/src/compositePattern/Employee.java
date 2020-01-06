package compositePattern;

public interface Employee {
	void add(Employee employee);
	void remove(Employee employee);
	Employee getChild(int i);
	void print();
}

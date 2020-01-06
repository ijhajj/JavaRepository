package collectionsDemo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(101, "Henry");
		map.put(42, "IP");
		map.put(3, "SuperMan");
		map.put(101,"NewHenry");
		
		System.out.println(map);//Does maintain the order of the elements
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key:keys) {
			System.out.println(map.get(key));
		}
		
		//HashTable
		Map<Integer,String> table = new Hashtable();
		table.put(1,"A");
		table.put(9, "B");
		table.put(7,"C");
		table.put(3, "D");
		System.out.println(table);
		Set<Integer> keySet = table.keySet();
		for(Integer key:keySet) {
			System.out.println(table.get(key));
		}
		System.out.println("Usage of Entry interface to fetch map key value pairs");
		//Usage of entrySet from Entry Interface
		Set<Map.Entry<Integer,String>> values = table.entrySet();
		for (Map.Entry<Integer,String> keyValuePair:values) {
			System.out.println(keyValuePair.getKey() + " = " + keyValuePair.getValue());
		}
	}

}

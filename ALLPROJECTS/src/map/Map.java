package map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Anusha");
		map.put(2, "Ravi");
		map.put(3, "Joshna");
		map.put(3, "keerthi");
		map.put(null, "Anil");
		map.put(null, "mouni");

		System.out.println(map.get(1));
		System.out.println(map.get(3));

		Set<Integer> keys = map.keySet();
		for(Integer d: keys) {
			System.out.println(d);
		}
		
		Collection<String> values = map.values();
		for(String d: values) {
			System.out.println(d);
		}

	}
}
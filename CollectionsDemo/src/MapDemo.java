import java.util.HashMap;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String,String> map= new HashMap<>();
	map.put("jack","jill");
	map.put("scott","tiger");
	map.put("duke","java");
	map.put("jack","rose");
	map.put("jill","rose");
	
	for(String key: map.keySet())
		System.out.println(key+ ":" +map.get(key));
	
}
}

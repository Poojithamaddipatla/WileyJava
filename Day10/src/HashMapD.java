import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapD {
	public static void main(String[] args) {
		Map<String, String> myMap=new HashMap<String,String>();	
		
		myMap.put("S101", "Poojitha");
		myMap.put("S102","Poorna");
		myMap.put("S103","Teja");
		myMap.put("S105", "Priya");
		System.out.println(myMap);
		String name=myMap.get("S102");
		System.out.println(name);
		
		String s=myMap.getOrDefault("S105", "Some Defaults");
		System.out.println(s);
		
		System.out.println(myMap);
		Set<Entry<String,String>> mySet=myMap.entrySet();
		System.out.println(mySet);
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
	}
}

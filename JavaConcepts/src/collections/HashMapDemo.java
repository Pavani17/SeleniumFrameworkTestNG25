package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "pavani");
		hm.put(1, "kakileti");
		hm.put(2, "satya");
		hm.put(34, "java");
		System.out.println(hm.get(1));

		hm.remove(34);
		System.out.println(hm);

		Set sm = hm.entrySet();
		Iterator it = sm.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());

			System.out.println(mp.getValue());

		}

	}

}

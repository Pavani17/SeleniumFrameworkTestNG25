package collections;

import java.util.ArrayList;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// Print unique number from the list- Amazon
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {

				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j])

					{
						k++;
					}
				}
				// System.out.println(a[i]); //System.out.println(k);
				if (k == 1)
					System.out.println(a[i] + "is unique number");
			}
		}
	}

}

package a1;

import java.text.DecimalFormat;
import java.util.*;

public class A1Adept {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".00");
		Scanner scanner = new Scanner(System.in);
		int itemAmount = scanner.nextInt();
		String[] items = new String[itemAmount*2];
		for(int i = 0; i < itemAmount*2; i++) {
			items[i] = scanner.next();
		}
		
		
		int times = scanner.nextInt();
		double[] cost = new double[times];
		double itemCost = 0;
		double total= 0;
		String[] firstNames = new String[times];
		String[] lastNames = new String[times];
		for (int j = 0; j < times; j++) {
			firstNames[j] = scanner.next();
			lastNames[j] = scanner.next();
			for (int k = scanner.nextInt(); k > 0 ; k--) {		
				int amount = scanner.nextInt();
				String itemBought = scanner.next();		
				for(int l = 0; l< itemAmount*2; l+=2) {							
					if (items[l].equals(itemBought)) {
						itemCost = amount*Double.parseDouble(items[l+1]);
						break;
					}
				}
				total+=itemCost;
			}
			cost[j]=total;
			total = 0;
		}
		
		
		double biggest = 0;
		int biggestsName = 0;
		double smallest = cost[0];
		int smallestsName = 0;
		double average = 0;
		for (int a = 0; a < times; a++) {
			if (biggest<cost[a]) {
				biggest = cost[a];
				biggestsName = a;
			}
			if (smallest>cost[a]) {
				smallest = cost[a];
				smallestsName = a;
			}
			average+=cost[a];
		}
		average /= times;
		System.out.println("Biggest: "+firstNames[biggestsName]+" "
				+lastNames[biggestsName]
				+" ("+df.format(biggest)+")");
		System.out.println("Smallest: "+firstNames[smallestsName]+" "
				+lastNames[smallestsName]
				+" ("+df.format(smallest)+")");
		System.out.println("Average: "+df.format(average));
		if(scanner != null) {
		    scanner.close();
		}
	}
}

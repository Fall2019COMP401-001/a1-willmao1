package a1;

import java.text.DecimalFormat;
import java.util.*;

public class A1Novice {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		double total = 0;
		String[] firstNames = new String[times];
		String[] lastNames = new String[times];
		double[] cost = new double[times];
		for (int i = 0; i<times ; i ++) {
			firstNames[i] = scanner.next();
			lastNames[i] = scanner.next();
			for (int items = scanner.nextInt(); items > 0 ; items --) {
				
				int numberOfItems = scanner.nextInt();
				scanner.next();
				double priceOfItems = scanner.nextDouble();
				total+= numberOfItems*priceOfItems;
			}
			cost[i] = total;
			total = 0;
		}
		for (int j = 0; j<times ; j++) {
			System.out.println(firstNames[j].substring(0,1)+". "+lastNames[j]+": "+df.format(cost[j]));
		}
		if(scanner != null) {
		    scanner.close();
		}
	}
}

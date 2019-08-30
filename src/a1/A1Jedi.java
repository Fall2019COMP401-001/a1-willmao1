package a1;

import java.util.Scanner;

public class A1Jedi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int itemAmount = scanner.nextInt();
		String[] items = new String[itemAmount*2];
		int[] customers = new int[itemAmount*2];
		for(int i = 0; i < itemAmount*2; i++) {
			items[i] = scanner.next();
			customers[i] = 0;
		}
		
		
		int times = scanner.nextInt();
		double[] cost = new double[times];
		double itemCost = 0;
		double total= 0;
		String[] firstNames = new String[times];
		String[] lastNames = new String[times];
		for(int j = 0; j < times; j++) {
			firstNames[j] = scanner.next();
			lastNames[j] = scanner.next();
			for(int k = scanner.nextInt(); k > 0 ; k--) {		
				int amount = scanner.nextInt();
				String itemBought = scanner.next();		
				for(int l = 0; l< itemAmount*2; l+=2) {							
					if (items[l].equals(itemBought)) {
						itemCost = amount*Double.parseDouble(items[l+1]);
						customers[l]+=amount;
						customers[l+1]+=1;
						break;
					}
				}
				total+=itemCost;
			}
			cost[j]=total;
			total = 0;
		}
		
		
		for(int a = 0; a < itemAmount*2; a+=2) {
			if ((customers[a+1]) == 0 ) 
				System.out.println("No customers bought "+items[a]);
			else
				System.out.println(customers[a+1]+" customers bought "+customers[a]+" "+items[a]);
		}	
		if(scanner != null) {
		    scanner.close();
		}
	}
}

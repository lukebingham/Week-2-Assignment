
public class App {

	public static void main(String[] args) {
		// Week 2 Coding Assignment Luke Bingham
		
		boolean isHotOutside = true;
		System.out.println(isHotOutside);

		boolean isWeekday = false;
		System.out.println(isWeekday);
		
		boolean hasMoneyInPocket = true;
		System.out.println(hasMoneyInPocket);
		
		double costOfMilk = 2.55;
		System.out.println("The cost of a gallon of milk is: " + "$" + costOfMilk);
		
		int moneyInWallet = 27;
		System.out.println("James has " + "$" + moneyInWallet + " in his wallet.");
		
		int thirstLevel = 8;
		System.out.println("On a scale of 1 to 10, James has a thirst level of: " + thirstLevel);
	
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIceCream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && (moneyInWallet >= 2 * costOfMilk);
		System.out.println(willBuyMilk);
		
		
		
		
	}

}

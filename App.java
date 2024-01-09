public class App {
	public static void main(String[] args) {
        // Basic
		// Beverage plainBeverage = new PlainBeverage();
		// System.out.println("You order " + plainBeverage.getDescription());
		// System.out.println("The cost is " + plainBeverage.getCost());

        // Advance
        Beverage beverageWithMilkAndSugar = new MilkDecorator(new SugarDecorator(new PlainBeverage()));
        System.out.println("You order " + beverageWithMilkAndSugar.getDescription());
        System.out.println("The cost is " + beverageWithMilkAndSugar.getCost());
	}
}
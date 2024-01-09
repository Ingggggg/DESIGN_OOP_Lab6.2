public class MilkDecorator implements CondimentDecorator {
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk ";
    }
}
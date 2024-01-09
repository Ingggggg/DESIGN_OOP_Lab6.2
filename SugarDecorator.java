public class SugarDecorator implements CondimentDecorator {
    private Beverage beverage;

    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "sugar ";
    }
}
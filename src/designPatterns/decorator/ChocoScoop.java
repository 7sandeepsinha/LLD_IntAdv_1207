package designPatterns.decorator;

public class ChocoScoop implements  Dessert{
    private Dessert dessert;

    public ChocoScoop(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public int getCost() {
        return dessert.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()  + "ChocoScoop, ";
    }
}

package designPatterns.decorator;

public class ChocoSyrup implements  Dessert{
    private Dessert dessert;

    public ChocoSyrup(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public int getCost() {
        return dessert.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()  + "ChocoSyrup, ";
    }
}

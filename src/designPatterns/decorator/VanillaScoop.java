package designPatterns.decorator;

//only an addon not base
public class VanillaScoop implements Dessert {
    private Dessert dessert;

    public VanillaScoop(Dessert dessert) {
        this.dessert = dessert;
    }


    @Override
    public int getCost() {
        return dessert.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + "Vanilla Scoop, ";
    }
}

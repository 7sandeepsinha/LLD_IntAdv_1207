package designPatterns.decorator;

//both base and addon
public class VanillaCone implements Dessert {
    private Dessert dessert;

    public VanillaCone(Dessert dessert){
        this.dessert = dessert;
    }

    public VanillaCone() {
    }

    @Override
    public int getCost() {
        if(dessert == null){
            return 25;
        } else {
            return dessert.getCost() + 25;
        }
    }

    @Override
    public String getDescription() {
        if(dessert == null){
            return "Vanilla Cone, ";
        } else {
            return dessert.getDescription() + "Vanilla Cone, ";
        }
    }
}

package designPatterns.decorator;

//can only be a base  - for demo
// in reality orange cone can be both base and addon
public class OrangeCone implements Dessert{
    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone, ";
    }
}

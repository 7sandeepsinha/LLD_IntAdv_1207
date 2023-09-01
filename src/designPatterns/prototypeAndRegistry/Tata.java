package designPatterns.prototypeAndRegistry;

public class Tata implements ICar<Tata> {
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    public Tata(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    public Tata(Tata t) {
        this(t.modelName, t.engineSize, t.noOfWheels, t.serialNumber);
    }

    @Override
    public Tata clone() {
        return null;
    }
}

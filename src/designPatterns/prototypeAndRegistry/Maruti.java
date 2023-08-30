package designPatterns.prototypeAndRegistry;

public class Maruti implements ICar{
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    public Maruti(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    public Maruti(Maruti m) {
        this(m.modelName, m.engineSize, m.noOfWheels, m.serialNumber);
    }

    @Override
    public ICar clone() {
        return null;
    }
}

package designPatterns.prototypeAndRegistry;

public class Maruti implements ICar<Maruti> {
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

    public Maruti() {
    }

    @Override
    public Maruti clone() {
        Maruti m = new Maruti();
        m.engineSize = this.engineSize;
        m.modelName = this.modelName;
        m.noOfWheels = this.noOfWheels;
        m.serialNumber = this.serialNumber;
        return m;
    }
}

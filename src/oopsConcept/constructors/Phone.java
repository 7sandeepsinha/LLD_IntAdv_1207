package oopsConcept.constructors;

public class Phone {
    String modelName;
    String brandName;
    int modelNo;
    int displaySize;
    int batterySize;
    int megapixels;
    int numberOfCameras;
    int ram;
    int price;

    public Phone(String phoneModelName, String pBrandName, int pModelNo, int pDisplaySize,
                 int pBatterySize, int pMegapixels, int pNoOfCamera, int pRam, int pPrice){
        modelName = phoneModelName;
        brandName = pBrandName;
        modelNo = pModelNo;
        displaySize = pDisplaySize;
        batterySize = pBatterySize;
        megapixels = pMegapixels;
        numberOfCameras = pNoOfCamera;
        ram = pRam;
        price = pPrice;
    }

    public Phone(Phone phone){ // COPY CONSTRUCTOR
        modelName = phone.modelName;
        brandName = phone.brandName;
        modelNo = phone.modelNo + 1;
        displaySize = phone.displaySize;
        batterySize = phone.batterySize;
        megapixels = phone.megapixels;
        numberOfCameras = phone.numberOfCameras;
        ram = phone.ram;
        price = phone.price + 10000;
    }
}

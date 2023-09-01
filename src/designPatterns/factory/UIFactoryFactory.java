package designPatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform platform){
        return switch (platform){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            case WINDOWS -> new WindowsFactory();
        };
    }
}


/*
    UIFactory -> creates object of UI elements, Menu, DropDown, Button etc.
    UIFactoryFactory -> creating objects of UIFactory, Androidfactory/IosFactory
 */
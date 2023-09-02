package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = UIFactoryFactory.getUIFactory(SupportedPlatform.WINDOWS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();

    }
}

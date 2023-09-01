package designPatterns.factory;

import designPatterns.factory.UIFactory;
import designPatterns.factory.components.button.AndroidButton;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IosButton;
import designPatterns.factory.components.dropdown.AndroidDropDown;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.dropdown.IosDropDown;
import designPatterns.factory.components.menu.AndroidMenu;
import designPatterns.factory.components.menu.IosMenu;
import designPatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}

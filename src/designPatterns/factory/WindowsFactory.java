package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.WindowsButton;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.dropdown.WindowsDropDown;
import designPatterns.factory.components.menu.Menu;
import designPatterns.factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}

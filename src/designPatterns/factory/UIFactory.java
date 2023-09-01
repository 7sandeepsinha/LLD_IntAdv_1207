package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}

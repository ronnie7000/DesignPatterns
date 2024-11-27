package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.components.button.Button;
import AbstractFactoryPattern.components.dropdown.Dropdown;

public interface UiFactory {

    Button getButton();

    Dropdown getDropdown();
    
}

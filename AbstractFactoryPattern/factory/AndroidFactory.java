package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.components.button.AndroidButton;
import AbstractFactoryPattern.components.button.Button;
import AbstractFactoryPattern.components.dropdown.AndroidDropdown;
import AbstractFactoryPattern.components.dropdown.Dropdown;

public class AndroidFactory implements UiFactory{

    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown getDropdown() {
    return new AndroidDropdown();
    }
    
}

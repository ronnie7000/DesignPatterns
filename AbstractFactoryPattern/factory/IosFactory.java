package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.components.button.Button;
import AbstractFactoryPattern.components.button.IosButton;
import AbstractFactoryPattern.components.dropdown.Dropdown;
import AbstractFactoryPattern.components.dropdown.IosDropdown;

public class IosFactory implements UiFactory{

    @Override
    public Button getButton() {
        return new IosButton();
    }

    @Override
    public Dropdown getDropdown() {
        return new IosDropdown();
    }

    
}

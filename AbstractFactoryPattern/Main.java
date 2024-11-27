package AbstractFactoryPattern;

import AbstractFactoryPattern.components.button.Button;
import AbstractFactoryPattern.components.dropdown.Dropdown;
import AbstractFactoryPattern.enums.SupportedPlatforms;
import AbstractFactoryPattern.factory.UiFactory;

public class Main {
    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.setPlatforms(SupportedPlatforms.ANDROID);

        UiFactory uiFactory = ui.getUiFactory();

        Button button =  uiFactory.getButton();
        Dropdown dropdown = uiFactory.getDropdown();

        button.doSomething();
        dropdown.doSomething();

        
    }
    
}

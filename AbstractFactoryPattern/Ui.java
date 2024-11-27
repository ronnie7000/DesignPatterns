package AbstractFactoryPattern;

import AbstractFactoryPattern.enums.SupportedPlatforms;
import AbstractFactoryPattern.factory.AndroidFactory;
import AbstractFactoryPattern.factory.IosFactory;
import AbstractFactoryPattern.factory.UiFactory;

public class Ui {

    private SupportedPlatforms platforms;

    public SupportedPlatforms getPlatforms() {
        return platforms;
    }

    public void setPlatforms(SupportedPlatforms platforms) {
        this.platforms = platforms;
    }

    public void getVersion() {
        System.out.println("Version : 1.0.0");
    }

    public UiFactory getUiFactory() {
        switch(this.platforms) {
            case IOS : return new IosFactory();
            case ANDROID : return new AndroidFactory();
            default : return new AndroidFactory();
        }
    }
    
}

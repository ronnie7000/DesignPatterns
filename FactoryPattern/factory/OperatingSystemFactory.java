package FactoryPattern.factory;

import FactoryPattern.OS.OperatingSystem;
import FactoryPattern.OS.impl.Android;
import FactoryPattern.OS.impl.IOS;
import FactoryPattern.OS.impl.Windows;

public class OperatingSystemFactory {
        public OperatingSystem getOS(String str) {
                switch (str) {
                    case "Open" : return new Android(); 
                    case "Closed" : return new IOS(); 
                    default : return new Windows(); 
                }
        }
}

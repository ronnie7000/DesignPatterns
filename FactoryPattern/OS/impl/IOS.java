package FactoryPattern.OS.impl;

import FactoryPattern.OS.OperatingSystem;

public class IOS implements OperatingSystem {

    @Override
    public void specs() {
        System.out.println("Mosy secured OS");
    }
    
}

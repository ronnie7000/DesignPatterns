package FactoryPattern.OS.impl;

import FactoryPattern.OS.OperatingSystem;

public class Windows implements OperatingSystem {

    @Override
    public void specs() {
        System.out.println("Most useless OS");
    }
    
}

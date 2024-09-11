package FactoryPattern.OS.impl;

import FactoryPattern.OS.OperatingSystem;

public class Android implements OperatingSystem {

    @Override
    public void specs() {
        System.out.println("Most powerful OS");
    }
    
}

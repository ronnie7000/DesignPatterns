package FactoryPattern;

import FactoryPattern.OS.OperatingSystem;
import FactoryPattern.factory.OperatingSystemFactory;

public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();

        OperatingSystem os1 =  osf.getOS("Open");
        os1.specs();

        os1 = osf.getOS("Closed");
        os1.specs();

        os1 = osf.getOS("default");
        os1.specs();
    }
}
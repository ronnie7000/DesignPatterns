package DecoratorPattern.base;

import DecoratorPattern.Outfit;

public class Tshirt implements Outfit{

    @Override
    public void assemble() {
        System.out.println("Wearing tshirt");
    }
    
}

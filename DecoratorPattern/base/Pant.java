package DecoratorPattern.base;

import DecoratorPattern.Outfit;

public class Pant implements Outfit{

    @Override
    public void assemble() {
        System.out.println("Wearing pants");
    }
    
}

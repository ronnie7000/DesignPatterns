package DecoratorPattern;

import DecoratorPattern.base.Pant;
import DecoratorPattern.base.Tshirt;
import DecoratorPattern.decorators.Jacket;
import DecoratorPattern.decorators.Sweater;

public class Main {
    public static void main(String[] args) {
        Outfit o1 = new Jacket(new Tshirt());
        o1.assemble();

        System.out.println();
        
        Outfit o2 = new Jacket(new Sweater(new Pant()));
        o2.assemble();
    }
}

package DecoratorPattern.decorators;

import DecoratorPattern.Outfit;

public class Jacket extends OutfitDecorator{

    public Jacket(Outfit o) {
        super(o);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Wearing jacket");
    }

}

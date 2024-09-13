package DecoratorPattern.decorators;

import DecoratorPattern.Outfit;

public class Sweater extends OutfitDecorator{
        public Sweater(Outfit o) {
        super(o);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Wearing sweater");
    }
}

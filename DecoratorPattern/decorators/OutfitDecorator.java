package DecoratorPattern.decorators;

import DecoratorPattern.Outfit;

public class OutfitDecorator implements Outfit{

    protected Outfit o;

    public OutfitDecorator(Outfit o) {
        this.o = o;
    }

    @Override
    public void assemble() {
        this.o.assemble();
    }
    
}

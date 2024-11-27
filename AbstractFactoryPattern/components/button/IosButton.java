package AbstractFactoryPattern.components.button;

public class IosButton implements Button {
    @Override
    public void doSomething() {
        System.out.println("IOS button doing nothing");
    }
}

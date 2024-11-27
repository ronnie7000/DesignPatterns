package AbstractFactoryPattern.components.button;

public class AndroidButton implements Button{

    @Override
    public void doSomething() {
        System.out.println("Android button doing something");
    }
}

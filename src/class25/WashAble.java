package class25;

public interface WashAble{
    void wash();
}

class SmartWatch implements WashAble{
    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issues");
    }
}
class Phone implements WashAble{
    @Override
    public void wash() {

    }
}
class Inverter implements WashAble{
    @Override
    public void wash() {

    }
}

package structural.facade;

public class DemoFacade {

    public static void main(String[] args) {

        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();

    }

}

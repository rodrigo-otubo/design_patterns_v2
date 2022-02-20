package structural.decorator;

public class DemoDecorator {

    public static void main(String[] args) {

        System.out.println("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power: {}.\n" + troll.getAttackPower());


        System.out.println("A troll with huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power: {}.\n" + clubbedTroll.getAttackPower());

    }

}

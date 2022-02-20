package structural.facade;

public class DwarvenTunnelDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println("{} creates another promising tunnel." + name());
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
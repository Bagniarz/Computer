package pc.system.computerParts.powerSupply.powerSupplies;

import pc.system.computerParts.powerSupply.PowerSupply;

public class Gigabyte implements PowerSupply {
    private final int power;

    public Gigabyte(int power) {
        this.power = power;
    }

    @Override
    public int getPowerOutput() {
        return power;
    }

    @Override
    public String toString() {
        return "Gigabyte{" +
                "power=" + power +
                '}';
    }
}

package pc.system.computerParts.powerSupply.powerSupplies;

import pc.system.computerParts.powerSupply.PowerSupply;

public class EndorfyPowerSupply implements PowerSupply {
    private final int power;

    public EndorfyPowerSupply(int power) {
        this.power = power;
    }

    @Override
    public int getPowerOutput() {
        return power;
    }

    @Override
    public String toString() {
        return "Endorfy{" +
                "power=" + power +
                '}';
    }
}

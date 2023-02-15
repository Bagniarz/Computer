package pc.system.pcVariants;

import pc.system.computerParts.computerCase.ComputerCase;
import pc.system.computerParts.motherboard.Motherboard;
import pc.system.computerParts.powerSupply.PowerSupply;

public class Windows implements PC{

    private boolean on;
    private final Motherboard motherboard;
    private final PowerSupply powerSupply;
    private final ComputerCase computerCase;

    public Windows(Motherboard motherboard, PowerSupply powerSupply, ComputerCase computerCase, boolean on) {
        String operatingSystem = "Windows";
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
        this.computerCase = computerCase;
        this.on = on;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public Motherboard getMotherBoard() {
        return motherboard;
    }

    @Override
    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    @Override
    public ComputerCase getComputerCase() {
        return computerCase;
    }

    @Override
    public void printSystemInfo() {
        System.out.println("Memory: " + this.motherboard.getRam().getMemory());
        System.out.println("Processor: " + this.motherboard.getProcessor().getAmountOfCores());
        System.out.println("GraphicsCard: " + this.motherboard.getGraphicsCard().getMemory());
    }

    @Override
    public String toString() {
        return "Windows{" +
                "on=" + on +
                ", motherboard=" + motherboard +
                ", powerSupply=" + powerSupply +
                ", computerCase=" + computerCase +
                '}';
    }
}

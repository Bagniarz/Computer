package pc.system.pcVariants;

import pc.system.computerParts.computerCase.ComputerCase;
import pc.system.computerParts.motherboard.Motherboard;
import pc.system.computerParts.powerSupply.PowerSupply;

public interface PC {
    void turnOn();
    void turnOff();
    Motherboard getMotherBoard();
    PowerSupply getPowerSupply();
    ComputerCase getComputerCase();
    void printSystemInfo();
}

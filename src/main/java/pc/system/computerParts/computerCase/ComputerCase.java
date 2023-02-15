package pc.system.computerParts.computerCase;

import pc.system.computerParts.motherboard.coolingSystem.CoolingType;

public interface ComputerCase {
    ComputerCaseType getComputerCaseType();
    String getName();
    CoolingType getCoolingType();
}

package pc.system.computerParts.computerCase.cases;

import pc.system.computerParts.computerCase.ComputerCase;
import pc.system.computerParts.computerCase.ComputerCaseType;
import pc.system.computerParts.motherboard.coolingSystem.CoolingType;

public class Endorfy implements ComputerCase {
    @Override
    public ComputerCaseType getComputerCaseType() {
        return ComputerCaseType.FULL_TOWER;
    }

    @Override
    public String getName() {
        return "ENDORFY SIGNUM 300 ARGB";
    }

    @Override
    public CoolingType getCoolingType() {
        return CoolingType.PASSIVE;
    }
}

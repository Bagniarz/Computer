package pc.system.computerParts.computerCase.cases;

import pc.system.computerParts.computerCase.ComputerCase;
import pc.system.computerParts.computerCase.ComputerCaseType;
import pc.system.computerParts.motherboard.coolingSystem.CoolingType;

public class Silentium implements ComputerCase {
    @Override
    public ComputerCaseType getComputerCaseType() {
        return ComputerCaseType.MIDI_TOWER;
    }

    @Override
    public String getName() {
        return "SILENTIUMPC KRUX TREK TG PURE BLACK";
    }

    @Override
    public CoolingType getCoolingType() {
        return CoolingType.ACTIVE;
    }
}

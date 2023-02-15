package pc.system.computerParts.motherboard.bios.bioses;

import pc.system.computerParts.motherboard.bios.Bios;

public class AMI implements Bios {
    @Override
    public boolean isNewest() {
        return true;
    }

    @Override
    public String getName() {
        return "AMI";
    }
}

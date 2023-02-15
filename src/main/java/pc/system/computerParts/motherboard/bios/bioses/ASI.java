package pc.system.computerParts.motherboard.bios.bioses;

import pc.system.computerParts.motherboard.bios.Bios;

public class ASI implements Bios {
    @Override
    public boolean isNewest() {
        return false;
    }

    @Override
    public String getName() {
        return "ASI";
    }
}

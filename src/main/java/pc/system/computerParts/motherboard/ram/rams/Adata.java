package pc.system.computerParts.motherboard.ram.rams;

import pc.system.computerParts.motherboard.ram.MemoryType;
import pc.system.computerParts.motherboard.ram.Ram;

public class Adata implements Ram {
    @Override
    public int getMemory() {
        return 16;
    }

    @Override
    public MemoryType getMemoryType() {
        return MemoryType.DDR4;
    }

    @Override
    public String getName() {
        return "ADATA XPG Spectrix";
    }
}

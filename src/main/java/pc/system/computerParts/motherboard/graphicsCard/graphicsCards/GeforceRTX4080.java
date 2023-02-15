package pc.system.computerParts.motherboard.graphicsCard.graphicsCards;

import pc.system.computerParts.motherboard.coolingSystem.CoolingType;
import pc.system.computerParts.motherboard.graphicsCard.GraphicsCard;
import pc.system.computerParts.motherboard.graphicsCard.GraphicsCardMemoryType;

public class GeforceRTX4080 implements GraphicsCard {
    @Override
    public int getMemory() {
        return 16384;
    }

    @Override
    public GraphicsCardMemoryType getMemoryType() {
        return GraphicsCardMemoryType.SDRAM;
    }

    @Override
    public String getName() {
        return "Geforce RTX 4080";
    }

    @Override
    public CoolingType getCoolingType() {
        return CoolingType.ACTIVE;
    }
}

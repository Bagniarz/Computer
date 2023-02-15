package pc.system.computerParts.motherboard.graphicsCard;

import pc.system.computerParts.motherboard.coolingSystem.CoolingType;

public interface GraphicsCard {
    int getMemory();
    GraphicsCardMemoryType getMemoryType();
    String getName();
    CoolingType getCoolingType();
}

package pc.system.computerParts.motherboard.graphicsCard.graphicsCards;

import pc.system.computerParts.motherboard.coolingSystem.CoolingType;
import pc.system.computerParts.motherboard.graphicsCard.GraphicsCard;
import pc.system.computerParts.motherboard.graphicsCard.GraphicsCardMemoryType;

public class RadeonRX7900 implements GraphicsCard {
    @Override
    public int getMemory() {
        return 24576;
    }

    @Override
    public GraphicsCardMemoryType getMemoryType() {
        return GraphicsCardMemoryType.SDRAM;
    }

    @Override
    public String getName() {
        return "Radeon RX 7900";
    }

    @Override
    public CoolingType getCoolingType() {
        return CoolingType.PASSIVE;
    }
}

package pc.system.computerParts.motherboard;

import pc.system.computerParts.motherboard.bios.Bios;
import pc.system.computerParts.motherboard.graphicsCard.GraphicsCard;
import pc.system.computerParts.motherboard.processor.Processor;
import pc.system.computerParts.motherboard.ram.Ram;

public interface Motherboard {
    Ram getRam();
    GraphicsCard getGraphicsCard();
    Bios getBios();
    Processor getProcessor();
}

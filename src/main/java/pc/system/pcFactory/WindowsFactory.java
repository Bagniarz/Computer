package pc.system.pcFactory;

import pc.system.computerParts.computerCase.cases.Silentium;
import pc.system.computerParts.motherboard.bios.bioses.ASI;
import pc.system.computerParts.motherboard.graphicsCard.graphicsCards.GeforceRTX4080;
import pc.system.computerParts.motherboard.motherboards.Asus;
import pc.system.computerParts.motherboard.processor.processors.AmdRyzen;
import pc.system.computerParts.motherboard.ram.rams.GoodRam;
import pc.system.computerParts.powerSupply.powerSupplies.Gigabyte;
import pc.system.pcVariants.PC;
import pc.system.pcVariants.Windows;

public class WindowsFactory extends PcFactory {
    @Override
    public PC createPC() {
        return new Windows(new Asus(new GoodRam(), new GeforceRTX4080(),
                new AmdRyzen(), new ASI()), new Gigabyte(750), new Silentium(), false);
    }
}

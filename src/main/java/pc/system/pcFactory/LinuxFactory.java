package pc.system.pcFactory;

import pc.system.computerParts.computerCase.cases.Endorfy;
import pc.system.computerParts.motherboard.bios.bioses.AMI;
import pc.system.computerParts.motherboard.graphicsCard.graphicsCards.GeforceRTX4080;
import pc.system.computerParts.motherboard.motherboards.Msi;
import pc.system.computerParts.motherboard.processor.processors.IntelI9;
import pc.system.computerParts.motherboard.ram.rams.Adata;
import pc.system.computerParts.powerSupply.powerSupplies.EndorfyPowerSupply;
import pc.system.pcVariants.Linux;
import pc.system.pcVariants.PC;

public class LinuxFactory extends PcFactory{

    @Override
    public PC createPC() {
        return new Linux(new Msi(new Adata(), new GeforceRTX4080(), new IntelI9(),
                new AMI()), new EndorfyPowerSupply(750), new Endorfy(), false);
    }
}

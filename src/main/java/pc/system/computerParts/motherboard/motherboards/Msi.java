package pc.system.computerParts.motherboard.motherboards;

import pc.system.computerParts.motherboard.Motherboard;
import pc.system.computerParts.motherboard.bios.Bios;
import pc.system.computerParts.motherboard.bios.bioses.AMI;
import pc.system.computerParts.motherboard.graphicsCard.GraphicsCard;
import pc.system.computerParts.motherboard.graphicsCard.graphicsCards.GeforceRTX4080;
import pc.system.computerParts.motherboard.processor.Processor;
import pc.system.computerParts.motherboard.processor.processors.IntelI9;
import pc.system.computerParts.motherboard.ram.Ram;
import pc.system.computerParts.motherboard.ram.rams.GoodRam;

public class Msi implements Motherboard {

    private final Ram ram;
    private final GraphicsCard card;
    private final Processor processor;
    private final Bios bios;

    public Msi(Ram ram, GraphicsCard card, Processor processor, Bios bios) {
        this.ram = ram;
        this.card = card;
        this.processor = processor;
        this.bios = bios;
    }

    @Override
    public Ram getRam() {
        return ram;
    }

    @Override
    public GraphicsCard getGraphicsCard() {
        return card;
    }

    @Override
    public Bios getBios() {
        return bios;
    }

    @Override
    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Msi{" +
                "ram=" + ram +
                ", card=" + card +
                ", processor=" + processor +
                ", bios=" + bios +
                '}';
    }
}

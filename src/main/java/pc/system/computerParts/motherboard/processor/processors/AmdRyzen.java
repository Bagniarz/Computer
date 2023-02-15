package pc.system.computerParts.motherboard.processor.processors;

import pc.system.computerParts.motherboard.processor.Processor;

public class AmdRyzen implements Processor {
    @Override
    public boolean canOverClock() {
        return true;
    }

    @Override
    public int getAmountOfCores() {
        return 16;
    }

    @Override
    public int getAmountOfThreads() {
        return 32;
    }

    @Override
    public int getTDP() {
        return 170;
    }

    @Override
    public String getName() {
        return "AMD Ryzen 9 7950X";
    }

    @Override
    public String getSocket() {
        return "Socket AM5";
    }
}

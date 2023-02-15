package pc.system.computerParts.motherboard.processor.processors;

import pc.system.computerParts.motherboard.processor.Processor;

public class IntelI9 implements Processor {
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
        return 24;
    }

    @Override
    public int getTDP() {
        return 150;
    }

    @Override
    public String getName() {
        return "Intel Core I9-12900KS";
    }

    @Override
    public String getSocket() {
        return "Socket1700";
    }
}

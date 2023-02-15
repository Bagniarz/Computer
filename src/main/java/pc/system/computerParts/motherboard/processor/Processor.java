package pc.system.computerParts.motherboard.processor;

public interface Processor {
    boolean canOverClock();
    int getAmountOfCores();
    int getAmountOfThreads();
    int getTDP();
    String getName();
    String getSocket();
}

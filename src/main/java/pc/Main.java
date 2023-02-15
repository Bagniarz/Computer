package pc;

import pc.system.pcFactory.LinuxFactory;
import pc.system.pcFactory.WindowsFactory;
import pc.system.pcVariants.PC;

public class Main {
    public static void main(String[] args) {
        WindowsFactory windowsFactory = new WindowsFactory();
        LinuxFactory linuxFactory = new LinuxFactory();
        PC pc2 = linuxFactory.createPC();
        PC pc = windowsFactory.createPC();
        System.out.println(pc);
        System.out.println(pc2);
        pc.printSystemInfo();
        pc2.printSystemInfo();
    }
}

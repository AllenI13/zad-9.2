public class Computer {
    Ram ram;
    Processor processor;
    HardDrive hardDrive;

    public Computer(Ram ram, Processor processor, HardDrive hardDrive) {
        this.ram = ram;
        this.processor = processor;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram + "\n" +
                "processor=" + processor + "\n" +
                "hardDrive=" + hardDrive + "\n" +
                ram.toString() + "\n" + processor.toString() + "\n" + hardDrive.toString();
    }
}

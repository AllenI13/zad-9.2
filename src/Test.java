public class Test {
    public static void main(String[] args) {
        Ram ram = new Ram("RXG359", "Nvidia", 555, 2000, 1000, 20, 100);
        Processor processor = new Processor("GFX88", "Nvidia", 666, 1000, 20, 100);
        HardDrive hardDrive = new HardDrive("GKSJD55", "Nvidia", 777, 505);
        Computer computer = new Computer(ram, processor, hardDrive);
        System.out.println(computer.toString());
        computer.processor.timingUp();
        computer.processor.timingUp();
        computer.processor.timingUp();
        computer.processor.timingUp();
        System.out.println(computer.toString());

    }
}

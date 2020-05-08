public class Ram extends Component {
    private int memory;
    private int timing;
    private double temp;
    private double maxTemp;

    public Ram(String model, String producer, int serialNumber, int memory, int timing, double temp, double maxTemp) {
        super(model, producer, serialNumber);
        this.memory = memory;
        this.timing = timing;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public void timingUp() {
        if ((temp + ((timing * 1.1 - timing) * 0.15)) < maxTemp) {
            double y = timing;
            timing *= 1.1;
            double z = (timing - y);
            System.out.println("timing : " + timing);
            temp += (z * 0.15);
            System.out.printf("Temp : " + "%.1f%n", temp);
            System.out.println();
        } else
            System.out.println("za wysoka temp");
    }

    @Override
    public String toString() {
        return "Ram{" +
                "memory=" + memory +
                ", timing=" + timing +
                ", temp=" + temp +
                ", maxTemp=" + maxTemp +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}


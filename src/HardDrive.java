public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String model, String producer, int serialNumber, int capacity) {
        super(model, producer, serialNumber);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "capacity=" + capacity +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}

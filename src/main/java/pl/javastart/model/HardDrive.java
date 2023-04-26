package pl.javastart.model;

public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String model, String producent, String serialNumber, int capacity) {
        super(model, producent, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

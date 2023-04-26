package pl.javastart.model;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDrive drive;

    public Computer(Processor processor, Memory memory, HardDrive drive) {
        this.processor = processor;
        this.memory = memory;
        this.drive = drive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDrive getDrive() {
        return drive;
    }

    public void setDrive(HardDrive drive) {
        this.drive = drive;
    }
}

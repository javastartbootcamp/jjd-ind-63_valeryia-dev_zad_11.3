package pl.javastart.task;

import pl.javastart.exception.TemperatureLimitException;
import pl.javastart.model.Computer;
import pl.javastart.model.HardDrive;
import pl.javastart.model.Memory;
import pl.javastart.model.Processor;

public class Main {

    public static void main(String[] args) {

        try {
            Processor proc = new Processor("GPP", "IBM", "123", 3000, 60, 40);
            Memory mem = new Memory("1500 Limit", "IBM", "1234", 1066, 4096, 70, 50);

        } catch (TemperatureLimitException e) {
            System.err.println(e.getMessage());

        }
        Processor proc = new Processor("GPP", "IBM", "123", 3000, 60, 40);
        Memory mem = new Memory("1500 Limit", "IBM", "1234", 1066, 4096, 70, 50);
        HardDrive drive = new HardDrive("PATA", "IBM", "12345", 128);

            proc.overclock(400);
            mem.overclock(200);
    }
}

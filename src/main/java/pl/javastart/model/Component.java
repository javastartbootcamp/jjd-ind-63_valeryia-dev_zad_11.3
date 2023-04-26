package pl.javastart.model;

abstract class Component {
    private String model;
    private String producent;
    private String serialNumber;

    public Component(String model, String producent, String serialNumber) {
        this.model = model;
        this.producent = producent;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

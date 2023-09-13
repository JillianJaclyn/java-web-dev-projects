public class Laptop extends Computer {
    private Integer batteryLife;
    public Laptop(Integer RAM, Integer internalStorage, String videoCard, Integer batteryLife) {
        super(RAM, internalStorage, videoCard);
        this.batteryLife = batteryLife;
    }
    public Integer showBatteryLife() {
        return batteryLife;
    }
}

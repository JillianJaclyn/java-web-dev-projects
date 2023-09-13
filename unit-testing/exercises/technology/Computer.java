public class Computer {
    private Integer RAM;
    private Integer internalStorage;
    private String videoCard;

    public Computer(Integer RAM, Integer internalStorage, String videoCard) {
        this.RAM = RAM;
        this.internalStorage = internalStorage;
        this.videoCard = videoCard;
    }
    public Integer getRAM() {
        return RAM;
    }

    public Integer getInternalStorage() {
        return internalStorage;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setInternalStorage(Integer internalStorage) {
        this.internalStorage = internalStorage;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
    public Integer calculateNums(Integer num1, Integer num2) {
        return num1 + num2;
    }
    public boolean opensWebsite() {
        return true;
    }
}

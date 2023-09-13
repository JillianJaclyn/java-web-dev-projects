public class SmartPhone extends Computer {
    private Integer cellReception;
    public SmartPhone(Integer RAM, Integer internalStorage, String videoCard, Integer cellReception) {
        super(RAM, internalStorage, videoCard);
        this.cellReception = cellReception;
    }
    public Integer showCellReception() {
        return cellReception;
    }
}

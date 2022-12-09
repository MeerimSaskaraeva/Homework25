public class Car {
    private long id;
    private String numberAuto;

    public Car(long id, String numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "id=" + id +
                ", numberAuto='" + numberAuto + '\'' +
                '}';
    }
}

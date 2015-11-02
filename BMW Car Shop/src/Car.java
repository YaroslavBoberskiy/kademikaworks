/**
 * Created by YB on 02.11.2015.
 */
public class Car {

    private CarModel model;
    private CarColor color;
    private EngineType engineType;
    private WheelSize wheelSize;
    private BodyType bodyType;
    private String vinCode;
    private double engineSize;
    private double fuelConsumption;
    private double weight;
    private double price;

    Car () {

        model = CarModel.UNKNOWN;
        color = CarColor.UNKNOWN;
        engineType = EngineType.UNKNOWN;
        wheelSize = WheelSize.UNKNOWN;
        bodyType = BodyType.UNKNOWN;
        vinCode = "_";
        engineSize = 0;
        fuelConsumption = 0;
        weight = 0;
        price = 0;


    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

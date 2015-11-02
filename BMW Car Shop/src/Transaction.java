/**
 * Created by YB on 02.11.2015.
 */
public class Transaction {

    private String transactionID;
    private String transactionDate;
    private double totalSum;
    private double tax;
    private Client client;
    private Car car;
    private String transactionInfo;

    Transaction() {
        transactionID = "-";
        transactionDate = "-";
        totalSum = 0;
        tax = 0;
        client = null;
        car = null;
        transactionInfo = null;
    }

    Transaction (String transactionID, String transactionDate, Car car, Client client) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.car = car;
        this.client = client;
        transactionInfo = "ID: " + this.transactionID + ", DATE: " + this.transactionDate + ", CLIENT FIRST NAME: " +
                this.client.getFirstName() + ", CLIENT LAST NAME:" + this.client.getLastName() + ", CAR VIN:" +
                this.car.getVinCode() + ", CAR MODEL: " + this.car.getModel() + ", PRICE: " + this.car.getPrice();
    }

    // СОЗДАЙ ЗАПАСЫ АВТОМОБИЛЕЙ НА СКЛАДЕ!!!!! АУУУУ!!!!! НЕ ЗАБУДЬ!!!!

}

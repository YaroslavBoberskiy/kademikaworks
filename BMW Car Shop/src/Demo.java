/**
 * Created by YB on 02.11.2015.
 */
public class Demo {

    public static void main(String[] args) {

        ClientsDB cdb = new ClientsDB();
        cdb.fillDbWithTestClients();

        for (int i = 0; i < cdb.clientsDB.length; i ++) {
            if (cdb.clientsDB[i] != null) {
                System.out.println(cdb.clientsDB[i].getFirstName());
            }
        }

        Client c8 = new Client(TilteBeforeClientName.Dr, "Nestor", "Mann", "21.08.1958", "079-69-24-23", "nm@mail.com", "male", true);

        cdb.addNewClientToDB(c8);

        for (int i = 0; i < cdb.clientsDB.length; i ++) {
            if (cdb.clientsDB[i] != null) {
                System.out.println(cdb.clientsDB[i].getFirstName());
            }
        }

    }
}

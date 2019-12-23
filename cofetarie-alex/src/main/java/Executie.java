import model.Client;

import java.io.IOException;


public class Executie {

  public static void main (String[] args) throws IOException {

    Client client = construiereClientDefault();
    ClientControllerImpl Cristi = new ClientControllerImpl(client);

    Cristi.afisareNumeClient();
    Cristi.updateClient("nume", "Motrescu");
    Cristi.afisareNumeClient();


    Cristi.makePayment(100);

  }


  private static Client construiereClientDefault () {

    Client c = new Client();
    c.setNume("Popescu");
    c.setPrenume("Mircea-Alexandru");
    c.setAdresa("Strada Trei Fantani");
    c.setClientFidel(true);
    c.setVarsta(23);
    return c;
  }

}
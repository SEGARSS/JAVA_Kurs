package Java_Seminar;

import Java_Seminar.Seminar8.Classes.Actor;
import Java_Seminar.Seminar8.Classes.Market;
import Java_Seminar.Seminar8.Classes.OrdinaryClient;
import Java_Seminar.Seminar8.Classes.PensionerClient;
import Java_Seminar.Seminar8.Classes.SpecialClient;
import Java_Seminar.Seminar8.Classes.TaxService;
import Java_Seminar.Seminar8.Interfaces.iActorBehaviuor;

public class Seminar_08 {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident",1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviuor tax = new TaxService();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);

        magnit.update();
    }
}


package Java_Seminar.Seminar8.Interfaces;

import Java_Seminar.Seminar8.Classes.Actor;

public interface iActorBehaviuor {

    public boolean isTakeOrder() ;
    public boolean isMakeOrder() ;
    public void setTakeOrder(boolean takeOrder) ;
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    
}

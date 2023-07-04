package Java_Seminar.Seminar8.Interfaces;

import Java_Seminar.Seminar8.Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviuor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}

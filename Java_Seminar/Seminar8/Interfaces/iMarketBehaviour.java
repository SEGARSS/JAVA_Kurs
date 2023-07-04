package Java_Seminar.Seminar8.Interfaces;

import java.util.List;

import Java_Seminar.Seminar8.Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviuor actor);
    void releaseFromMarket(List<Actor> actor);
    void update();
}

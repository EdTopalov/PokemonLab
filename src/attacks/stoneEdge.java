package attacks;

import ru.ifmo.se.pokemon.*;

public class stoneEdge extends PhysicalMove {
    public stoneEdge(double pow, double acc){

        super(Type.ROCK, 100, 80);
    }

    @Override
    public double calcCriticalHit(Pokemon Att, Pokemon Deff) {
        if (Math.random() <= 0.125) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

        @Override
        protected String describe () {
            return "использует StoneEdge";
        }
}



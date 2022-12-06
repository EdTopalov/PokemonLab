package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/aerial-ace
public class aerialAce extends PhysicalMove {
    public static final double POSITIVE_INFINITY = 1.0/0.0;
    public aerialAce() {
        super(Type.FLYING, 60, POSITIVE_INFINITY);
    }

@Override
    protected void applyOppEffects(Pokemon p ){
    Effect eff = new Effect().turns(1);
    p.addEffect(eff);
    }
@Override
    protected String describe(){
        return "use aerialAce";
    }

}
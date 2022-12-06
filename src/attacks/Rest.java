package attacks;

import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC , 0 , 0);
    }
@Override
    protected void applySelfEffects(Pokemon p){
        Effect eff = new Effect();
        eff.turns(2);
        Effect.sleep(p);
        eff.stat(Stat.HP);
        p.addEffect(eff);

}
@Override
    protected String describe() {
        return " use Rest ";
    }
}

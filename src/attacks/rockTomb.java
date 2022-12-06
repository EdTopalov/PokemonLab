package attacks;

import ru.ifmo.se.pokemon.*;
public class rockTomb extends PhysicalMove {
    public rockTomb(){
        super(Type.ROCK , 60 , 95);

    }
@Override
   protected void applyOppEffects(Pokemon p){
    Effect eff = new Effect().stat(Stat.SPEED, -1);
    p.addEffect(eff);
}

@Override
    protected String describe(){
        return "use rockTomb";
    }

}

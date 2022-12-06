package attacks;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble(){
        super(Type.WATER , 40 , 100);

    }

@Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().turns(1).chance(0.1).stat(Stat.SPEED , -1);
        p.addEffect(eff);

}
@Override
    protected String describe(){
        return "use Bubble";
    }
}

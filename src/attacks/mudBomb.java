package attacks;

import ru.ifmo.se.pokemon.*;

public class mudBomb extends SpecialMove {
    public mudBomb(){super(Type.GROUND , 65 , 85);}
@Override
    protected void applyOppEffects(Pokemon p){
    Effect eff = new Effect().chance(0.30).stat(Stat.ACCURACY , -1).turns(1);
    p.addEffect(eff);
     }
@Override
    protected String describe(){
        return "use mudBomb";
}
}

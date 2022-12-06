package attacks;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch(){
        super(Type.DARK , 80 , 100);
    }

@Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.20).stat(Stat.DEFENSE , -1).turns(1);
        p.addEffect(eff);
    }
@Override
    protected String describe(){
        return "use Crunch";
}
}

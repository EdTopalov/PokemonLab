package attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends PhysicalMove {
    public Swagger(){
        super(Type.NORMAL , 0 , 85);
    }
@Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.confuse(p);
    Effect eff = new Effect().stat(Stat.ATTACK , 2);
    p.addEffect(eff);
    }

@Override
    protected String describe() {return "use swagger";}
}


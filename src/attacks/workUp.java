package attacks;

import ru.ifmo.se.pokemon.*;

public class workUp extends StatusMove {
    public workUp() {
        super(Type.NORMAL, 0, 0);
    }

@Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect().turns(1).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(eff);
    }

@Override
    protected String describe(){
        return " use Work Up ";
    }
}
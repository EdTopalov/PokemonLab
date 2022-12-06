package attacks;

import ru.ifmo.se.pokemon.*;

//статус покемона

public class doubleTeam extends StatusMove {
    public doubleTeam(){
        super(Type.NORMAL , 0 , 0);
    }
@Override
    protected void applySelfEffects(Pokemon p){
    if (p.getStat(Stat.EVASION) < 6)
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe() {
        return " использует DoubleTeam ";
    }

}

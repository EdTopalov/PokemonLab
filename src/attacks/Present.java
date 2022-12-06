package attacks;

import ru.ifmo.se.pokemon.*;


public class Present extends PhysicalMove {
    public Present() {
        super(Type.NORMAL, 0, 90);
    }
        @Override
        protected void applyOppDamage(Pokemon p, double damage) {
            double chance = Math.random();
            if (chance <= 0.4) {
                power = 40;
            } else if (chance <= 0.7) {
                power = 80;
            } else if (chance <= 0.8) {
                power = 120;
            } else {
                power = 0;
            }
            if (power != 0) {
                p.setMod(Stat.HP, (int) Math.round(damage));
            }
        }

@Override
    protected void applySelfEffects(Pokemon p) {
        if (power == 0) {
            p.setMod(Stat.HP, (int) -Math.round(p.getStat(Stat.HP) / 4));
    }
}

@Override
    protected String describe() {
        return "use Present";
    }
}

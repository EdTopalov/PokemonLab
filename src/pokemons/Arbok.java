package pokemons;

import attacks.*;


public class Arbok extends Ekans{
    public Arbok(String name, int level) {
        super(name, level);
        super.setStats(60 , 95 , 69 , 65 , 79 , 80);
        addMove(new Crunch());
    }
}

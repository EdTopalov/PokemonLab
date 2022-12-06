package pokemons;

import attacks.Bubble;

public class Azumarill extends Azurill{
    public Azumarill(String name, int level){
        super(name, level);
        super.setStats(100 ,50 ,80 ,60 ,80 ,50);
        super.addMove(new Bubble());
    }
}

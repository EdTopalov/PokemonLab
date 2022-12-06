package pokemons;

import attacks.Present;
import ru.ifmo.se.pokemon.Type;

public class Marill extends Azurill {
    public Marill(String name , int level){
        super(name, level);
        super.addType(Type.WATER);
        super.setStats(70 , 20 ,50 ,20 , 50 , 40);
        super.addMove(new Present());
    }
}

package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;


public class Ekans extends Pokemon {
    public Ekans(String name , int level){
        super(name , level);
        super.setType(Type.POISON);
        super.setStats(35 , 60 , 44 , 40 , 54 , 55);
        super.setMove(new Swagger() , new rockTomb() , new Crunch() , new mudBomb());
    }

}

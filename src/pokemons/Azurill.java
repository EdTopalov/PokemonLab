package pokemons;

import attacks.Rest;
import attacks.Swagger;
import attacks.workUp;
import ru.ifmo.se.pokemon.*;

public class Azurill extends Pokemon {
    public Azurill(String name , int level){
        super(name , level);
        super.setType(Type.NORMAL , Type.FAIRY);
        super.setStats(50 , 20 , 40 , 20 , 40 ,20 );
        super.setMove(new workUp() , new Rest());
    }
}

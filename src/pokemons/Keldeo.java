package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
//https://pokemondb.net/pokedex/keldeohttps://pokemondb.net/pokedex/keldeo

public class  Keldeo extends Pokemon {
    public Keldeo(String name, int level){
        super(name, level);
        super.setType(Type.WATER , Type.FIGHTING);
        super.setStats(91 , 72 , 90 , 129 , 90 , 108 );
        super.setMove(new aerialAce(), new Swagger(), new doubleTeam()  );

    }
}

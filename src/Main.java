import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args){

Battle b = new Battle();
        Arbok arbok = new Arbok("Vasya", 35);
        Keldeo keldeo  = new Keldeo("Ed", 31);
        Azumarill azumarill = new Azumarill(" Artem" , 38);
        Azurill azurill = new Azurill("Vasya#2" , 34);
        Ekans ekans = new Ekans("Ilya" , 30);
        Marill marill = new Marill("Alexandr" , 33);
        b.addAlly(azumarill);
        b.addAlly(ekans);
        b.addAlly(marill);
        b.addFoe(arbok);
        b.addFoe(keldeo);
        b.addFoe(azurill);
        b.go();
   }
}
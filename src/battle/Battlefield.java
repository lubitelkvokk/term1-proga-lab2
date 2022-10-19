package src.battle;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import src.pokemons.Azumarill;
import src.pokemons.Lucario;
import src.pokemons.Regice;


public class Battlefield {
    public static void main(String[] args) {
        Battle field = new Battle();
        Lucario a = new Lucario("Иннокентий", 25);
        //Regice b = new Regice("Нейрододик", 45);
        //Azumarill c = new Azumarill("НейроCRINZH",45 );
        Regice d = new Regice("НейроCRISTAL", 35);
        //c.getHP()-нынешнее здоровье
        //c.getStat(Stat.HP)-базовое значение
        //System.out.println(c.getHP());
        System.out.println(a.getStat(Stat.DEFENSE));
        field.addFoe(d);
        //field.addFoe(a);
        field.addAlly(a);
        field.go();
    }

}

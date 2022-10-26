package org.itmo.lab2.battle;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import org.itmo.lab2.pokemons.*;



public class Battlefield {
    public static void main(String[] args) {
        Battle field = new Battle();
        Riolu b = new Lucario("НейроЧЕЛИКС", 35);
        Regice a = new Regice("НейроCRISTAL", 35);
        Riolu c = new Riolu("НейроДОДИК", 45);
        Azumarill f = new Azumarill("НейроМИНЬОН", 35);
        Azurill d = new Azurill("НейроШМЫХ",45 );
        Marill e = new Marill("НейроВАФЛЯ", 35);


        //c.getHP()-нынешнее здоровье
        //c.getStat(Stat.HP)-базовое значение
        //System.out.println(c.getHP());
        //System.out.println(a.getStat(Stat.DEFENSE));
        field.addFoe(c);
        field.addFoe(a);
        field.addFoe(b);


        //field.addFoe(a);
        field.addAlly(f);
        field.addAlly(e);
        field.addAlly(d);
        field.go();
    }

}

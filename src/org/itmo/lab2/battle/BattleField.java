package org.itmo.lab2.battle;
import org.itmo.lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class BattleField {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Riolu b = new Lucario("НейроЧЕЛИКС", 35);
        Regice a = new Regice("НейроCRISTAL", 35);
        Riolu c = new Riolu("НейроДОДИК", 45);
        Azumarill f = new Azumarill("НейроМИНЬОН", 35);
        Azurill d = new Azurill("НейроШМЫХ", 45);
        Marill e = new Marill("НейроВАФЛЯ", 35);


        //c.getHP()-нынешнее здоровье
        //c.getStat(Stat.HP)-базовое значение
        //System.out.println(c.getHP());
        //System.out.println(a.getStat(Stat.DEFENSE));
        battle.addFoe(c);
        battle.addFoe(b);
        battle.addFoe(a);

        //field.addFoe(a);
        battle.addAlly(f);
        battle.addAlly(e);
        battle.addAlly(d);
        battle.go();

    }
}

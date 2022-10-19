package src.battle;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import src.pokemons.*;



public class Battlefield {
    public static void main(String[] args) {
        Battle field = new Battle();
        Regice a = new Regice("НейроCRISTAL", 35);
        Riolu b = new Lucario("НейроЧЕЛИКС", 35);
        Regice c = new Regice("НейроДОДИК", 45);
        Azurill d = new Azurill("НейроШМЫХ",45 );
        Marill e = new Marill("НейроВАФЛЯ", 35);
        Azumarill f = new Azumarill("НейроМИНЬОН", 35);

        //c.getHP()-нынешнее здоровье
        //c.getStat(Stat.HP)-базовое значение
        //System.out.println(c.getHP());
        //System.out.println(a.getStat(Stat.DEFENSE));
        field.addFoe(a);
        field.addFoe(b);
        field.addFoe(c);
        //field.addFoe(a);
        field.addAlly(d);
        field.addAlly(e);
        field.addAlly(f);
        field.go();
    }

}

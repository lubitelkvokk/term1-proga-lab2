package org.itmo.lab2.moves.riolu;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


public class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 100, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        //System.out.println(p.getStat(Stat.ATTACK));
    }

    @Override
    protected String describe() {
        return "применяет Swords Dance";
    }
}

package org.itmo.lab2.moves.riolu;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2).stat(Stat.HP, -(int) p.getStat(Stat.HP));
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        return "применяет Rest";
    }

}
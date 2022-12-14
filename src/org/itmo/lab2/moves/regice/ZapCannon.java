package org.itmo.lab2.moves.regice;

import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove {
    public ZapCannon() {
        super(Type.ELECTRIC, 120, 50);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
        Effect e = new Effect().chance(0.25).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Zap Cannon";
    }

}


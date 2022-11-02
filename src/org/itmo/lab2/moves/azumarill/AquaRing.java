package org.itmo.lab2.moves.azumarill;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    static int count = 0;

    public AquaRing() {
        super(Type.WATER, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // System.out.println(p.getStat(Stat.HP));
        //System.out.println(count);
        Effect e = new Effect().turns(-1).stat(Stat.HP, -(int) (p.getStat(Stat.HP) / 16));
        if (count == 0) {
//            p.setCondition(new Effect().turns(-1).stat(Stat.HP, -(int) (p.getStat(Stat.HP) / 2)));
            p.addEffect(e);
        }
        count++;

    }

    @Override
    protected String describe() {
        return "Использует Aqua Ring";
    }

}

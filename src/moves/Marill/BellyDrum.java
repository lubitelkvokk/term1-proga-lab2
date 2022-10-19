package src.moves.Marill;

import ru.ifmo.se.pokemon.*;

public class BellyDrum extends StatusMove {
    public BellyDrum() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        //p.addEffect(new Effect().stat(Stat.HP, (int) p.getStat(Stat.HP) / 2));
        p.setMod(Stat.HP, (int) (p.getStat(Stat.HP) / 2));
        p.setMod(Stat.ATTACK, 6);
    }

    @Override
    protected String describe() {
        return "Использует BellyDrum";
    }

}

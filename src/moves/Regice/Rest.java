package src.moves.Regice;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect();
        e.turns(2).sleep(p);
        p.getStat(Stat.HP);

    }

    @Override
    protected String describe() {
        return "применяет Rest";
    }

}
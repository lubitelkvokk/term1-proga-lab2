package src.moves.Riolu;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
//        super.applyOppEffects(p);
//        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
//        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Confide";
    }

}
package src.moves.Lucario;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat() {
        super(Type.FIGHTING, 120, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {

        Effect e = new Effect().stat(Stat.DEFENSE, 1).turns(-1);
        p.addEffect(e);
        System.out.println(p.getStat(Stat.DEFENSE));
    }

    @Override
    protected String describe() {
        return "применяет Close Combat";
    }

}


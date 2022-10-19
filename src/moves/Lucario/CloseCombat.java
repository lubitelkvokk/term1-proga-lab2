package src.moves.Lucario;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat() {
        super(Type.FIGHTING, 120, 100);
    }
    private static int count = 0;
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (count == 0) {
            Effect e = new Effect().stat(Stat.DEFENSE, 1).turns(-1);
            p.addEffect(e);
        }
        count += 1;

    }
    @Override
    protected void applyOppEffects(Pokemon p) {

        //System.out.println(p.getStat(Stat.HP));
    }

    @Override
    protected String describe() {
        return "применяет Close Combat";
    }

}


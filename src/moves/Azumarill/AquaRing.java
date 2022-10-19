package src.moves.Azumarill;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    public AquaRing() {
        super(Type.WATER, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
       // System.out.println(p.getStat(Stat.HP));

        p.setCondition(new Effect().turns(-1).stat(Stat.HP,-(int) (p.getStat(Stat.HP) / 16)));


    }

    @Override
    protected String describe() {
        return "Использует Aqua Ring";
    }

}

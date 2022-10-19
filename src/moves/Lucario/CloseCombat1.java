package src.moves.Lucario;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class CloseCombat1 extends PhysicalMove {
    public CloseCombat1() {
        super(Type.FIGHTING, 120, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "применяет Close Combat";
    }

}


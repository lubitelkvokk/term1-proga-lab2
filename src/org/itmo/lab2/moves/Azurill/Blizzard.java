package org.itmo.lab2.moves.Azurill;
import java.lang.Math;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends StatusMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.1)
            Effect.freeze(p);

    }
    @Override
    protected String describe(){
        return "Использует Blizzard";
    }

}

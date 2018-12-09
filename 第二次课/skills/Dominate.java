package team.redrock.skills;

import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Dizzy;

public class Dominate extends DamageSkill implements Dizzy {
    private static final String NAME = "控制术";
    private static final int DAMAGE = 2;
    private static final int DIZZY_TIME = 10;

    public Dominate() {
        super(NAME, DAMAGE);
    }

    @Override
    public int getTime() {
        return DIZZY_TIME;
    }


}

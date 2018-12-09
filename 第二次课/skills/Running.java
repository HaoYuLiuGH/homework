package team.redrock.skills;

import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Dizzy;

public class Running extends DamageSkill implements Dizzy {
    private static final String NAME = "跑！";
    private static final int DAMAGE = 1;
    private static final int DIZZY_TIME = 0;
public Running()
{
    super(NAME,DAMAGE);
}
    @Override
    public int getTime() {
        return DIZZY_TIME;
    }

}

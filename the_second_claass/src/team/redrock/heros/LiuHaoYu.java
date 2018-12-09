package team.redrock.heros;


import team.redrock.base.DamageSkill;
import team.redrock.base.Hero;
import team.redrock.base.Skill;

public class LiuHaoYu extends Hero {
    private final static String NAME = "刘浩瑜";
    private final static String STUID = "2018214293";
    private final static int STR = 100;
    private final static int INT = 200;
    private final static int AGI = 200;

    public LiuHaoYu()
    {
        super(NAME,STUID,STR,AGI,INT);
        Skill instantPrisonKill=new DamageSkill("暗狱影杀阵",100);
        super.addSkill(instantPrisonKill);

    }


}

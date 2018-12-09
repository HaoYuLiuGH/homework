package team.redrock.heros;

import team.redrock.base.Hero;
import team.redrock.base.Skill;
import team.redrock.skills.Dominate;
import team.redrock.skills.Running;


    public class BossTimor extends Hero {
        private final static String NAME = "大魔王";
        private final static String STUID = "23333";
        private final static int STR = 1;
        private final static int INT = 498;
        private final static int AGI = 1;

        public BossTimor()
        {
            super(NAME,STUID,STR,INT,AGI);
            Skill running=new Running();
            Skill dominate=new Dominate();
            super.addSkill(running);
            super.addSkill(dominate);
        }

}

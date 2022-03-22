package com.hyun.undecemberdpscalculator.service.zodiac.t2;

import com.hyun.undecemberdpscalculator.dto.DmgDto;

public class Forest {

    DmgDto dmgDto =new DmgDto();
    long nomalDmg;
    long physicDmg;
    long hitRating;

    public long getNomalDmg10() {
        dmgDto.mainAttributeDmgIcPer = 10;
        nomalDmg =dmgDto.mainAttributeDmgIcPer;
        return nomalDmg;
    }
    public long getNomalDmg20() {
        dmgDto.mainAttributeDmgIcPer = 20;
        nomalDmg =dmgDto.mainAttributeDmgIcPer;
        return nomalDmg;
    }
    public long getAttackHitRating10(){
        dmgDto.attackHitRating = 10;
        hitRating = dmgDto.attackHitRating;
        return hitRating;
    }
    public long getPhysicDmg10() {
        dmgDto.mainAttributeDmgIcPer = 10;
        physicDmg = dmgDto.mainAttributeDmgIcPer;
        return physicDmg;
    }
}

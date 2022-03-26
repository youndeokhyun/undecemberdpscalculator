package com.hyun.undecemberdpscalculator.service.zodiac.t2;

import com.hyun.undecemberdpscalculator.dto.DmgDto;

public class Forest {

    DmgDto dmgDto =new DmgDto();
    long nomalDmg;
    long physicDmg;
    long hitRating;

    public long getNomalDmg10() {
        dmgDto.setDmgIcPer(10);
        nomalDmg = dmgDto.getDmgIcPer();
        return nomalDmg;
    }
    public long getNomalDmg20() {
        dmgDto.setDmgIcPer(20);
        nomalDmg = dmgDto.getDmgIcPer();
        return nomalDmg;
    }
    public long getAttackHitRating10(){
        dmgDto.setAttackHitRating(10);
        hitRating = dmgDto.getAttackHitRating();
        return hitRating;
    }
    public long getPhysicDmg10() {
        dmgDto.setDmgIcPer(10);
        physicDmg = dmgDto.getDmgIcPer();
        return physicDmg;
    }
}

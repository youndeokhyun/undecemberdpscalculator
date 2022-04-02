package com.hyun.undecemberdpscalculator.service.zodiac.t2;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;
import org.springframework.stereotype.Service;

@Service
public class Forest extends ZodiacAB{

    DmgDto dmgDto =new DmgDto();

    // 피해
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
    // 적중도
    public long getAttackHitRating10(){
        dmgDto.setHitRating(10);
        rating = dmgDto.getHitRating();
        return rating;
    }
    // 물피
    public long getPhysicDmg10() {
        dmgDto.setDmgIcPer(10);
        physicDmg = dmgDto.getDmgIcPer();
        return physicDmg;
    }
    //원소피해
    public long getElementDmg() {
        dmgDto.setDmgIcPer(10);
        elementDmg = dmgDto.getDmgIcPer();
        return elementDmg;
    }



}

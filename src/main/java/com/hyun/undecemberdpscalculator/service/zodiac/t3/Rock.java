package com.hyun.undecemberdpscalculator.service.zodiac.t3;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;
import org.springframework.stereotype.Service;

@Service
public class Rock extends ZodiacAB {

    DmgDto dmgDto = new DmgDto();

    public long getAttackDmg10(){
        dmgDto.setDmgIcPer(10);
        attackDmg = dmgDto.getDmgIcPer();
        return attackDmg;
    }

    public long getAttackRating10(){
        dmgDto.setHitRating(10);
        attackRating = dmgDto.getHitRating();
        return attackRating;
    }
    public long getElementResist2(){
        dmgDto.setResist(2);
        elementResist = dmgDto.getResist();
        return elementResist;
    }
    
}

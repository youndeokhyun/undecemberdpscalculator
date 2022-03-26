package com.hyun.undecemberdpscalculator.service.zodiac;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import org.springframework.stereotype.Service;

@Service
public class AttackZodiac {
    DmgDto dmgDto = new DmgDto();
    long attack;
    long attackHitRating;
    long physicsDmg;


    // 물리 피해
    public long getPhysicsDmg10(){
        dmgDto.setDmgIcPer(10);
        physicsDmg = dmgDto.getDmgIcPer();
        return physicsDmg;
    }
    public long getPhysicsDmg30(){
        dmgDto.setDmgIcPer(30);
        physicsDmg = dmgDto.getDmgIcPer();
        return physicsDmg;
    }

}

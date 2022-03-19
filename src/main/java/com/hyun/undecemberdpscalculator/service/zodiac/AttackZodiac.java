package com.hyun.undecemberdpscalculator.service.zodiac;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import org.springframework.stereotype.Service;

@Service
public class AttackZodiac {
    DmgDto dmgDto = new DmgDto();
    long attack;
    long attackHitRating;
    long physicsDmg;

    // 공격시 피해
    public long getAttack5(){
        dmgDto.mainAttributeDmgIcPer = 5;
        attack = dmgDto.mainAttributeDmgIcPer;
        return attack;
    }
    public long getAttack10(){
       dmgDto.mainAttributeDmgIcPer = 10;
       attack = dmgDto.mainAttributeDmgIcPer;
       return attack;
    }
    public long getAttack20(){
        dmgDto.mainAttributeDmgIcPer = 20;
        attack = dmgDto.mainAttributeDmgIcPer;
        return attack;
    }
    // 공격 적중도
    public long getAttackHitRating10(){
        dmgDto.attackHitRaring = 10;
        attackHitRating = dmgDto.attackHitRaring;
        return attackHitRating;
    }
    // 물리 피해
    public long getPhysicsDmg10(){
        dmgDto.mainAttributeDmgIcPer = 10;
        physicsDmg = dmgDto.mainAttributeDmgIcPer;
        return physicsDmg;
    }
    public long getPhysicsDmg30(){
        dmgDto.mainAttributeDmgIcPer = 30;
        physicsDmg = dmgDto.mainAttributeDmgIcPer;
        return physicsDmg;
    }

}

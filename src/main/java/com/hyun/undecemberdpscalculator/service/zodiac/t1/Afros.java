package com.hyun.undecemberdpscalculator.service.zodiac.t1;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;
import org.springframework.stereotype.Service;

@Service
public class Afros extends ZodiacAB{

    DmgDto dmgDto = new DmgDto();

    // 공격시 피해
    public long getAttack5(){
        dmgDto.setDmgIcPer(5);
        attackDmg = dmgDto.getDmgIcPer();
        return attackDmg;
    }

    public long getAttack10(){
        dmgDto.setDmgIcPer(10);
        attackDmg = dmgDto.getDmgIcPer();
        return attackDmg;
    }

    // 공격 적중도
    public long getAttackHitRating10(){
        dmgDto.setHitRating(10);
        attackRating = dmgDto.getHitRating();
        return attackRating;
    }

    // 공속
    public long getAttackSpeed2(){
        dmgDto.setSpeedIc(2);
        attackSpeed = dmgDto.getSpeedIc();
        return attackSpeed;
    }

    // hp
    public long getHp13(){
        dmgDto.setHp(13);
        hpFlat = dmgDto.getHp();
        return hpFlat;
    }

}

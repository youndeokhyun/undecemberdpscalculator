package com.hyun.undecemberdpscalculator.service.zodiac.t1;

import com.hyun.undecemberdpscalculator.dto.DmgDto;

public class Afros {

    DmgDto dmgDto = new DmgDto();
    long attack;
    long attackOnHitRating;
    long attackSpeed;
    long hp;

    // 공격시 피해
    public long getAttack5(){
        dmgDto.setDmgIcPer(5);
        attack = dmgDto.getDmgIcPer();
        return attack;
    }
    public long getAttack10(){
        dmgDto.setDmgIcPer(10);
        attack = dmgDto.getDmgIcPer();
        return attack;
    }
    // 공격 적중도
    public long getAttackHitRating10(){
        dmgDto.setAttackHitRating(10);
        attackOnHitRating = dmgDto.getAttackHitRating();
        return attackOnHitRating;
    }
    // 공속
    public long getAttackSpeed2(){
        dmgDto.setAttackSpeed(2);
        attackSpeed = dmgDto.getAttackSpeed();
        return attackSpeed;
    }
    // hp
    public long getHp13(){
        dmgDto.setHpFlat(13);
        hp = dmgDto.getHpFlat();
        return hp;
    }

}

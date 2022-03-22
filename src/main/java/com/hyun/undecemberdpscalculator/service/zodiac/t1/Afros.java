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
        dmgDto.mainAttributeDmgIcPer = 5;
        attack = dmgDto.mainAttributeDmgIcPer;
        return attack;
    }
    public long getAttack10(){
        dmgDto.mainAttributeDmgIcPer = 10;
        attack = dmgDto.mainAttributeDmgIcPer;
        return attack;
    }
    // 공격 적중도
    public long getAttackHitRating10(){
        dmgDto.attackHitRating = 10;
        attackOnHitRating = dmgDto.attackHitRating;
        return attackOnHitRating;
    }
    // 공속
    public long getAttackSpeed2(){
        dmgDto.attackSpeed =2;
        attackSpeed = dmgDto.attackSpeed;
        return attackSpeed;
    }
    // hp
    public long getHp13(){
        dmgDto.hpFlat = 13;
        hp = dmgDto.hpFlat;
        return hp;
    }

}

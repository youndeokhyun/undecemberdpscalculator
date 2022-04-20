package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
public  class DmgDto {
    
    public long attackDmg, spellDmg; // 공격시,주문시 뎀증
    public long catapultDmg, minionDmg; // 쇠뇌 ,하수인 뎀증
    public long nomalDmg, physicDmg ,elementDmg,fireDmg, iceDmg ,lightningDmg ,poisonDmg; // 피해 , 물리 원소 불 냉기 번개 뎀증
    public long attackRating,spellRating, rating; // 공격,주문 적중도
    public long attackSpeed, spellSpeed; // 공속,시속 +
    public long attackSpeedAc, spellSpeedAc; // 공속,시속 *
    public long abyssSpeed, abyssSpellSpeed, catapultSpeed, KnightSpeed; // 심연체 공시속 , 쇠뇌 공속 , 기사 공속
    public long hpFlat, hpPer, hpAc; // hp 플렛 증가 증폭
    public long mpFlat, mpPer, mpAc; // mp 플렛 증가 증폭
    public long elementResist,fireResist, iceResist ,lightningResist ,poisonResist,chaosResist; // 각각의 저항

}

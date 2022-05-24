package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class ZodiacDto {
    
    private double attackDmg, spellDmg; // 공격시,주문시 뎀증
    private double catapultDmg, minionDmg; // 쇠뇌 ,하수인 뎀증
    private double nomalDmg, physicDmg ,elementDmg,fireDmg, iceDmg ,lightningDmg ,poisonDmg; // 피해 , 물리 원소 불 냉기 번개 뎀증
    private double attackRating,spellRating, rating; // 공격,주문 적중도
    private double attackSpeedIc, spellSpeedIc; // 공속,시속 +
    private double attackSpeedAc, spellSpeedAc; // 공속,시속 *
    private double abyssSpeed, abyssSpellSpeed, catapultSpeed, KnightSpeed; // 심연체 공시속 , 쇠뇌 공속 , 기사 공속
    private double hpFlat, hpPer, hpAc; // hp 플렛 증가 증폭
    private double mpFlat, mpPer, mpAc; // mp 플렛 증가 증폭
    private double elementResist,fireResist, iceResist ,lightningResist ,poisonResist,chaosResist; // 각각의 저항

}

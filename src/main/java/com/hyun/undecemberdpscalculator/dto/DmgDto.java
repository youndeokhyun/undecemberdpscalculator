package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class DmgDto {
    
    private List<Integer> attackDmg, spellDmg; // 공격시,주문시 뎀증
    private List<Integer> catapultDmg, minionDmg; // 쇠뇌 ,하수인 뎀증
    private List<Integer> nomalDmg, physicDmg ,elementDmg,fireDmg, iceDmg ,lightningDmg ,poisonDmg; // 피해 , 물리 원소 불 냉기 번개 뎀증
    private List<Integer> attackRating,spellRating, rating; // 공격,주문 적중도
    private List<Integer> attackSpeed, spellSpeed; // 공속,시속 +
    private List<Integer> attackSpeedAc, spellSpeedAc; // 공속,시속 *
    private List<Integer> abyssSpeed, abyssSpellSpeed, catapultSpeed, KnightSpeed; // 심연체 공시속 , 쇠뇌 공속 , 기사 공속
    private List<Integer> hpFlat, hpPer, hpAc; // hp 플렛 증가 증폭
    private List<Integer> mpFlat, mpPer, mpAc; // mp 플렛 증가 증폭
    private List<Integer> elementResist,fireResist, iceResist ,lightningResist ,poisonResist,chaosResist; // 각각의 저항

}

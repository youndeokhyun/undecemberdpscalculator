package com.huyn.undecemberdpscalculator.service;

import lombok.Setter;

@Setter
public abstract class Dmg {

    // 앞에 변수 증가 뒤에 감소
    public long minPhysicsDmgIc , maxPhysicsDmgIc;  // 최대 물피
    public long minAttackDmgIc , maxAttackDmgIc;  // 최소 물피
    public long physicsDmgIcPer , physicsDmgIcDownPer; // 물피%
    public long attackDmgIcPer , attackDmgIcDownPer; // 공피%
    public long areaDmgIcPer , areaDmgIcDownPer;  // 광역피해 %
    public long attackSpeedIcPer , attackSpeedIcDownPer; //공속
    public long nomalDmgIcPer , nomalDmgIcDownPer; // 피해%
    public long attackOnDmgPer;  // 공격시 피해
    public long attackHitRating;  //공격 적중도
    public long hpAcflat , hpAcPer , hpIcPer; // 순서대로 hp 플렛 증가 증폭
    public long mpAcflat , mpAcPer , mpIcPer; // 순서대로 mp 플렛 증가 증폭

    //증폭  * 개념
    public long physicsDmgAcPer , physicsDmgAcDownPer;  // 물피%
    public long areaDmgAcPer , areaDmgAcDownPer; // 광역피해 %
    public long attackSpeedAcPer , attackSpeedAcDownPer; //공속
    public long nomalDmgAcPer , nomalDmgAcDownPer; // 피해%


    public long minBasicDmg , maxBasicDmg; // 최소 최대 기본 피해
    public long minAllDmg , maxAllDmg; //  전체 계산식 최소 최대
    public long skillflat , skillPer; // 스킬 계수 및 %

    public long minBasicCalculator(){
        minBasicDmg = (minPhysicsDmgIc + skillflat) *  skillPer;
        return minBasicDmg;
    }

    public long maxBasicCalculator(){
        maxBasicDmg = (maxPhysicsDmgIc + skillflat) *  skillPer;
        return maxBasicDmg;
    }

    public long minDmgCalculator(){
        minAllDmg = (long) (minBasicDmg + (1+ physicsDmgIcPer *0.01)* (1+ physicsDmgAcPer*0.01)
                                *(1- physicsDmgAcDownPer*0.01));
        return minAllDmg;
    }

    public long maxDmgCalculator(){
        maxAllDmg = (long) (maxBasicDmg + (1+ physicsDmgIcPer *0.01)* (1+ physicsDmgAcPer*0.01)
                        *(1- physicsDmgAcDownPer*0.01));
        return minAllDmg;
    }



}

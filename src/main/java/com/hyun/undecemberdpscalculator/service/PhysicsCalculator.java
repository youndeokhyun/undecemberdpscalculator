package com.hyun.undecemberdpscalculator.service;

import org.springframework.stereotype.Service;

@Service
public class PhysicsCalculator implements DmgInter{


    public long minBasicDmg , maxBasicDmg; // 최소 최대 기본 피해
    public long minAllDmg , maxAllDmg; //  전체 계산식 최소 최대



    @Override
    public long minBasicCalculator() {
        return minBasicDmg;
    }

    @Override
    public long maxBasicCalculator() {
        return maxBasicDmg;
    }

    @Override
    public long minDmgCalculator() {
        return minAllDmg;
    }

    @Override
    public long maxDmgCalculator() {
        return maxAllDmg;
    }


//    @Override
//    public long minBasicCalculator(){
//        minBasicDmg = (minAttackDmgIc + minMainAttributeDmgIc + skillflat) *  skillPer;
//        return minBasicDmg;
//    }
//    @Override
//    public long maxBasicCalculator(){
//        maxBasicDmg = (maxMainAttributeDmgIc + skillflat) *  skillPer;
//        return maxBasicDmg;
//    }
//    @Override
//    public long minDmgCalculator(){
//        minAllDmg = (long) (minBasicDmg * (1+ mainAttributeDmgIcPer *0.01)* (1+ mainAttributeAcPer*0.01)
//                *(1- mainAttributeAcDownPer*0.01));
//        return minAllDmg;
//    }
//    @Override
//    public  long maxDmgCalculator(){
//        maxAllDmg = (long) (maxBasicDmg * (1+ mainAttributeDmgIcPer *0.01)* (1+ mainAttributeAcPer*0.01)
//                *(1- mainAttributeAcDownPer*0.01));
//        return minAllDmg;
//    }

}

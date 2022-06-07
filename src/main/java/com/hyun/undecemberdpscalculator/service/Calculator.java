package com.hyun.undecemberdpscalculator.service;

import com.hyun.undecemberdpscalculator.dto.WeaponDto;
import com.hyun.undecemberdpscalculator.dto.ZodiacDto;
import org.springframework.stereotype.Service;


@Service
public class Calculator implements DmgInter{

    public long minBasicDmg , maxBasicDmg; // 최소 최대 기본 피해
    public long minAllDmg , maxAllDmg; //  전체 계산식 최소 최대

    public double speed(WeaponDto wDto){
        double ws =  wDto.getWSpeed();
        double wps = wDto.getWpSpeed();
        return  ws * wps;

    }

    @Override
    public long minBasicCalculator() { return 0;}

    @Override
    public long maxBasicCalculator() {
        return 0;
    }

    @Override
    public long minDmgCalculator() {
        return 0;
    }

    @Override
    public long maxDmgCalculator() {
        return 0;
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

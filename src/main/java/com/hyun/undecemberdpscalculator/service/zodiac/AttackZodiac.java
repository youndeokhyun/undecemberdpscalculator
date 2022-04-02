package com.hyun.undecemberdpscalculator.service.zodiac;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;
import org.springframework.stereotype.Service;

@Service
public class AttackZodiac extends ZodiacAB {
    DmgDto dmgDto = new DmgDto();

    // 공격 시 피해
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
    public long getAttack15(){
        dmgDto.setDmgIcPer(15);
        attackDmg = dmgDto.getDmgIcPer();
        return attackDmg;
    }
    public long getAttack20(){
        dmgDto.setDmgIcPer(20);
        attackDmg = dmgDto.getDmgIcPer();
        return attackDmg;
    }
    //  광전사 로직
    //    public long berserkerNesting(){
//        long berserker= 10;
//    long hit = 0;
//            for(int i =0; i<berserker; i++){
//        hit += 3;
//        System.out.println(hit);
//        return hit;
//    }

    // 주문시 피해
    public long getSpellDmg5() {
        dmgDto.setDmgIcPer(5);
        spellDmg =dmgDto.getDmgIcPer();
        return spellDmg;
    }
    public long getSpellDmg10() {
        dmgDto.setDmgIcPer(10);
        spellDmg =dmgDto.getDmgIcPer();
        return spellDmg;
    }
    public long getSpellDmg15() {
        dmgDto.setDmgIcPer(15);
        spellDmg =dmgDto.getDmgIcPer();
        return spellDmg;
    }
    public long getSpellDmg20() {
        dmgDto.setDmgIcPer(20);
        spellDmg =dmgDto.getDmgIcPer();
        return spellDmg;
    }


}

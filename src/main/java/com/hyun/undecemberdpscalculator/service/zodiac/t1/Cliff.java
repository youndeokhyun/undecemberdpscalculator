package com.hyun.undecemberdpscalculator.service.zodiac.t1;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;
import org.springframework.stereotype.Service;

@Service
public class Cliff extends ZodiacAB {

    DmgDto dmgDto = new DmgDto();


    // 주문시 피해 증가
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
    public long getSpellDmg20() {
        dmgDto.setDmgIcPer(20);
        spellDmg =dmgDto.getDmgIcPer();
        return spellDmg;
    }
    // hp 플렛
    public long getHp13() {
        dmgDto.setHp(13);
        hpFlat = dmgDto.getHp();
        return hpFlat;
    }
    // 주문 적중도
    public long getSpellRating10() {
        dmgDto.setHitRating(10);
        spellRating = dmgDto.getHitRating();
        return spellRating;
    }
    //시속
    public long getSpellSpeed2() {
        dmgDto.setSpeedIc(2);
        spellRating = dmgDto.getSpeedIc();
        return spellSpeed;
    }
}

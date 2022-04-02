package com.hyun.undecemberdpscalculator.service.zodiac.t1;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;
import org.springframework.stereotype.Service;

@Service
public class Grassland extends ZodiacAB{

    DmgDto dmgDto = new DmgDto();



    // 하수인 쇠뇌 피해
    public long getMinionDmg10() {
        dmgDto.setDmgIcPer(10);
        minionDmg = dmgDto.getDmgIcPer();
        return minionDmg;
    }
    public long getMinionDmg20() {
        dmgDto.setDmgIcPer(20);
        minionDmg = dmgDto.getDmgIcPer();
        return minionDmg;
    }

    public long getCatapultDmg10() {
        dmgDto.setDmgIcPer(10);
        catapultDmg = dmgDto.getDmgIcPer();
        return catapultDmg;
    }
    public long getCatapultDmg20() {
        dmgDto.setDmgIcPer(20);
        catapultDmg = dmgDto.getDmgIcPer();
        return catapultDmg;
    }

    // 심연체 쇠뇌 기사 공속
    public long getAbyssSpeed2() {
        dmgDto.setSpeedIc(2);
        abyssSpeed = dmgDto.getSpeedIc();
        return abyssSpeed;
    }
    // 시속
    public long getAbyssSpellSpeed2() {
        dmgDto.setSpeedIc(2);
        abyssSpellSpeed = dmgDto.getSpeedIc();
        return abyssSpellSpeed;
    }

    public long getCatapultSpeed2() {
        dmgDto.setSpeedIc(2);
        catapultSpeed = dmgDto.getSpeedIc();
        return catapultSpeed;
    }

    public long getKnightSpeed2() {
        dmgDto.setSpeedIc(2);
        KnightSpeed = dmgDto.getSpeedIc();
        return KnightSpeed;
    }
}

package com.hyun.undecemberdpscalculator.service.zodiac;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import com.hyun.undecemberdpscalculator.service.ZodiacAB;

public class PropertyZodiac extends ZodiacAB{

    DmgDto dmgDto = new DmgDto();

    // 피해
    public long getNomalDmg9() {
        dmgDto.setDmgIcPer(9);
        nomalDmg = dmgDto.getDmgIcPer();
        return nomalDmg;
    }
    public long getNomalDmg10() {
        dmgDto.setDmgIcPer(10);
        nomalDmg = dmgDto.getDmgIcPer();
        return nomalDmg;
    }
    public long getNomalDmg20() {
        dmgDto.setDmgIcPer(20);
        nomalDmg = dmgDto.getDmgIcPer();
        return nomalDmg;
    }
    // 물리 피해
    public long getPhysicDmg10() {
        dmgDto.setDmgIcPer(10);
        physicDmg = dmgDto.getDmgIcPer();
        return physicDmg;
    }
    public long getPhysicDmg30() {
        dmgDto.setDmgIcPer(30);
        physicDmg = dmgDto.getDmgIcPer();
        return physicDmg;
    }

    // 원소 피해
    public long getElementDmg10() {
        dmgDto.setDmgIcPer(10);
        elementDmg = dmgDto.getDmgIcPer();
        return elementDmg;
    }
    public long getElementDmg30() {
        dmgDto.setDmgIcPer(30);
        elementDmg = dmgDto.getDmgIcPer();
        return elementDmg;
    }

    // 원소 피해 세분화
    public long getFireDmg10() {
        dmgDto.setDmgIcPer(10);
        fireDmg = dmgDto.getDmgIcPer();
        return fireDmg;
    }

    public long getIceDmg10() {
        dmgDto.setDmgIcPer(10);
        iceDmg = dmgDto.getDmgIcPer();
        return iceDmg;
    }

    public long getLightningDmg10() {
        dmgDto.setDmgIcPer(10);
        lightningDmg= dmgDto.getDmgIcPer();
        return  lightningDmg;
    }

    public long getPoisonDmg10() {
        dmgDto.setDmgIcPer(10);
        poisonDmg = dmgDto.getDmgIcPer();
        return poisonDmg;
    }


}

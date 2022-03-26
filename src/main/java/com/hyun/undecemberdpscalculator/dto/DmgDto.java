package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class DmgDto {

    private long minDmgIc , maxDmgIc;
    private long dmgIcPer , dmgIcDownPer;
    private long dmgAcPer , dmgAcDownPer;
    private long attackOnHitPer , hitRating;
    private long areaDmg,areaDmgAc;
    private long attackSpeed,attackSpeedDown,attackSpeedAc,attackSpeedAcDown;
    private long attackHitRating;
    private long hpFlat, hpPer , hpAc , hpIc;



}

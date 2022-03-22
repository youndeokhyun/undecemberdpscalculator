package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class DmgDto {

    public long minMainAttributeDmgIc , maxMainAttributeDmgIc;
    public long mainAttributeDmgIcPer , mainAttributeIcDownPer;
    public long mainAttributeAcPer , mainAttributeAcDownPer;
    public long attackOnHitPer , hitRating;
    public long areaDmg,areaDmgAc;
    public long attackSpeed,attackSpeedDown,attackSpeedAc,attackSpeedAcDown;
    public long attackHitRating;
    public long hpFlat, hpPer , hpAc , hpIc;



}

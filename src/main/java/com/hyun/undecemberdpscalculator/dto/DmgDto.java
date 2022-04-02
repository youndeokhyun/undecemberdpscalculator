package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

@Getter
@Setter
public  class DmgDto {

    private long minDmgIc , maxDmgIc; // 최대 최소뎀
    private long dmgIcPer , dmgIcDownPer; // %뎀 증가 감소  +
    private long dmgAcPer , dmgAcDownPer; // %뎀 증폭 감폭  *
    private long hitRating; // 적중도
    private long SpeedIc,SpeedIcDown,SpeedAc,SpeedAcDown; // 공속 시속
    private long hp; // 체력
    private long mp; // 마나
    private long resist ,chaosResist; //저항
}

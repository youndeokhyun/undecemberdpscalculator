package com.hyun.undecemberdpscalculator.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class WeaponDto {

    private double wpSpeed, wSpeed;
    private double wpCritical , wCritical;
    private double wpMinFlat , wpMaxFlat , wMinElementFlat , wMaxElementFlat;
    private double wNomalIc;



}

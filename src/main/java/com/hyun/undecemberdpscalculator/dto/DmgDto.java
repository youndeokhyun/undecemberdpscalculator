package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class DmgDto {

    public long minMainAttributeDmgIc , maxMainAttributeDmgIc;
    public long mainAttributeDmgIcPer , mainAttributeIcDownPer;
    public long mainAttributeAcPer , mainAttributeAcDownPer;
    public long speed,speedDown,speedAc,speedAcDown;
    public long attackHitRaring;


    @Builder
    public DmgDto(long minMainAttributeDmgIc , long maxMainAttributeDmgIc , long mainAttributeDmgIcPer , long mainAttributeIcDownPer ,long mainAttributeAcPer , long mainAttributeAcDownPer , long speed , long speedAc , long speedDown , long speedAcDown){
      this.minMainAttributeDmgIc = minMainAttributeDmgIc;
      this.maxMainAttributeDmgIc = maxMainAttributeDmgIc;
      this.mainAttributeDmgIcPer = mainAttributeDmgIcPer;
      this.mainAttributeIcDownPer = mainAttributeIcDownPer;
      this.mainAttributeAcPer = mainAttributeAcPer;
      this.mainAttributeAcDownPer = mainAttributeAcDownPer;
      this.speed = speed;
      this.speedAc = speedAc;
      this.speedAcDown = speedAcDown;
      this.speedDown = speedDown;
    }

}

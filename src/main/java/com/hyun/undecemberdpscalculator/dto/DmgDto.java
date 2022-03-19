package com.hyun.undecemberdpscalculator.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class DmgDto {

    public long minMainAttributeDmgIc , maxMainAttributeDmgIc;
    public long mainAttributeDmgIcPer , mainAttributeIcDownPer;
    public long mainAttributeAcPer , mainAttributeAcDownPer;


    @Builder
    public DmgDto(long minMainAttributeDmgIc , long maxMainAttributeDmgIc , long mainAttributeDmgIcPer , long mainAttributeIcDownPer ,long mainAttributeAcPer , long mainAttributeAcDownPer){
      this.minMainAttributeDmgIc = minMainAttributeDmgIc;
      this.maxMainAttributeDmgIc = maxMainAttributeDmgIc;
      this.mainAttributeDmgIcPer = mainAttributeDmgIcPer;
      this.mainAttributeIcDownPer = mainAttributeIcDownPer;
      this.mainAttributeAcPer = mainAttributeAcPer;
      this.mainAttributeAcDownPer = mainAttributeAcDownPer;
    }

}

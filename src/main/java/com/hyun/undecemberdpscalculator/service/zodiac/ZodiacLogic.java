package com.hyun.undecemberdpscalculator.service.zodiac;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import org.springframework.stereotype.Service;

@Service
public class ZodiacLogic {

    long arrd;


    public long getArr(){
      DmgDto dmgDto = new DmgDto();
      arrd = dmgDto.mainAttributeDmgIcPer = 5;
      return arrd;
    }


}

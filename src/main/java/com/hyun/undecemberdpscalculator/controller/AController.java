package com.hyun.undecemberdpscalculator.controller;

import com.hyun.undecemberdpscalculator.dto.DmgDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AController {



    @GetMapping("/")
    public String mainPage(){
        return "main";
    }

    @PostMapping("/result")
    public String aaa(DmgDto dmgDto){
        DmgDto dto = new DmgDto();
        dto.setDmgIcPer(dmgDto.dmgIcPer);
        return "redirect:/";
    }

    // 메인
    @GetMapping("/zodiac")
    public String zodiacMainPage(){
        return "/zodiac/zodiacmain";
    }
    // t1
    @GetMapping("/zodiac/t1/afros")
    public String afros(){
        return "/zodiac/t1/afros";
    }

    @GetMapping("/zodiac/t1/cliff")
    public String cliff(){return "/zodiac/t1/cliff";}

    @GetMapping("/zodiac/t1/grassland")
    public String grassland(){return "/zodiac/t1/grassland";}

    // t2
    @GetMapping("/zodiac/t2/bog")
    public String bog(){return "/zodiac/t2/bog";}

    @GetMapping("/zodiac/t2/explorer")
    public String explorer(){return "/zodiac/t2/explorer";} // 탐험가

    @GetMapping("/zodiac/t2/forest")
    public String forest(){return "/zodiac/t2/forest";}

    @GetMapping("/zodiac/t2/vagabond")
    public String vagabond(){return "/zodiac/t2/vagabond";}

    //t3
    @GetMapping("/zodiac/t3/eunos")
    public String eunos(){return "/zodiac/t3/eunos";}

    @GetMapping("/zodiac/t3/gold")
    public String gold(){return "/zodiac/t3/gold";}

    @GetMapping("/zodiac/t3/jewel")
    public String jewel(){return "/zodiac/t3/jewel";}

    @GetMapping("/zodiac/t3/rock")
    public String rock(){return "/zodiac/t3/rock";}

    //t4
    @GetMapping("/zodiac/t4/freere")
    public String freere(){return "/zodiac/t4/freere";}

    @GetMapping("/zodiac/t4/leaf")
    public String leaf(){return  "/zodiac/t4/leaf";}

    @GetMapping("/zodiac/t4/petal")
    public String petal(){return  "/zodiac/t4/petal";}

    @GetMapping("/zodiac/t4/root")
    public String root(){return  "/zodiac/t4/root";}

    @GetMapping("/zodiac/t4/seed")
    public String seed(){return "/zodiac/t4/seed";}

    @GetMapping("/zodiac/t4/stem")
    public String stem(){return "/zodiac/t4/stem";}

    //t5
    @GetMapping("/zodiac/t5/contrast")
    public String contrast(){return "/zodiac/t5/contrast";}

    @GetMapping("/zodiac/t5/dew")
    public String dew(){return "/zodiac/t5/dew";}

    @GetMapping("/zodiac/t5/fog")
    public String fog(){return  "/zodiac/t5/fog";}

    @GetMapping("/zodiac/t5/frost")
    public String forst(){return "/zodiac/t5/frost";}

    @GetMapping("/zodiac/t5/fruit")
    public String fruit(){return "/zodiac/t5/fruit";}

    @GetMapping("/zodiac/t5/glare")
    public String glare(){return "/zodiac/t5/glare";}

    @GetMapping("/zodiac/t5/hira")
    public String hira(){return "/zodiac/t5/hira";}

    @GetMapping("/zodiac/t5/lightning")
    public String lightning(){return "/zodiac/t5/lightning";}

    @GetMapping("/zodiac/t5/mine")
    public String mine(){return "/zodiac/t5/mine";}

    @GetMapping("/zodiac/t5/rainbow")
    public String rainbow(){return "/zodiac/t5/rainbow";}

    //t6
    @GetMapping("/zodiac/t6/breath")
    public String breath(){return "/zodiac/t6/breath";}

    @GetMapping("/zodiac/t6/convection")
    public String convection(){return "/zodiac/t6/convection";}

    @GetMapping("/zodiac/t6/cycle")
    public String cycle(){return "/zodiac/t6/cycle";}

    @GetMapping("/zodiac/t6/flow")
    public String flow(){return "/zodiac/t6/flow";}

    @GetMapping("/zodiac/t6/laugh")
    public String laugh(){return "/zodiac/t6/laugh";}

    @GetMapping("/zodiac/t6/nemera")
    public String nemera(){return "/zodiac/t6/nemera";}

    @GetMapping("/zodiac/t6/swimming")
    public String swimming(){return "/zodiac/t6/swimming";}

    @GetMapping("/zodiac/t6/trai")
    public String trai(){return "/zodiac/t6/trai";}

    //t7
    @GetMapping("/zodiac/t7/atmosphere")
    public String atmosphere(){return "/zodiac/t7/atmosphere";}

    @GetMapping("/zodiac/t7/dust")
    public String dust(){return "/zodiac/t7/dust";}

    @GetMapping("/zodiac/t7/muckworm")
    public String muckworm(){return "/zodiac/t7/muckworm";}

    @GetMapping("/zodiac/t7/orthemis")
    public String orthemis(){return "/zodiac/t7/orthemis";}

    @GetMapping("/zodiac/t7/scent")
    public String scent(){return "/zodiac/t7/scent";}

    @GetMapping("/zodiac/t7/spider")
    public String spider(){return "/zodiac/t7/spider";}

    @GetMapping("/zodiac/t7/stink")
    public String stink(){return "/zodiac/t7/stink";}

    @GetMapping("/zodiac/t7/venom")
    public String venom(){return "/zodiac/t7/venom";}

    // t8
    @GetMapping("/zodiac/t8/aurora")
    public String aurora(){return "/zodiac/t8/aurora";}

    @GetMapping("/zodiac/t8/blacksmith")
    public String blacksmith(){return "/zodiac/t8/blacksmith";}

    @GetMapping("/zodiac/t8/carpenter")
    public String carpenter(){return "/zodiac/t8/carpenter";}

    @GetMapping("/zodiac/t8/corruption")
    public String corruption(){return "/zodiac/t8/corruption";}

    @GetMapping("/zodiac/t8/farmer")
    public String farmer(){return "/zodiac/t8/farmer";}

    @GetMapping("/zodiac/t8/hunter")
    public String hunter(){return "/zodiac/t8/hunter";}

    @GetMapping("/zodiac/t8/leia")
    public String leia(){return "/zodiac/t8/leia";}

    @GetMapping("/zodiac/t8/plague")
    public String plague(){return "/zodiac/t8/plague";}

    @GetMapping("/zodiac/t8/shadow")
    public String shadow(){return "/zodiac/t8/shadow";}

    @GetMapping("/zodiac/t8/shepherd")
    public String shepherd(){return "/zodiac/t8/shepherd";}

    //전문화
    // 전문화 - 강철
    @GetMapping("/zodiac/special/steel")
    public String steel(){return "/zodiac/special/steel/steel";} // 시작 부분

    @GetMapping("/zodiac/special/sadness")
    public String sadness(){return "/zodiac/special/steel/sadness";} //슬픔

    @GetMapping("/zodiac/special/tipan")
    public String tipan(){return "/zodiac/special/steel/tipan";} // 티판

    @GetMapping("/zodiac/special/torchlight")
    public String torchlight(){return "/zodiac/special/steel/torchlight";} // 횟불

    //전문화 - 망치
    @GetMapping("/zodiac/special/hammer")
    public String hammer(){return "/zodiac/special/hammer/hammer";} // 망치 시작부분

    @GetMapping("/zodiac/special/anger")
    public String anger(){return "/zodiac/special/hammer/anger";} // 분노

    @GetMapping("/zodiac/special/flame")
    public String flame(){return "/zodiac/special/hammer/flame";} //불꽃

    @GetMapping("/zodiac/special/bonfire")
    public String bonfire(){return "/zodiac/special/hammer/bonfire";} // 모닥불

    //전문화 - 어둠
    @GetMapping("/zodiac/special/dark")
    public String dark(){return "/zodiac/special/dark/dark";} //어둠 시작부분

    @GetMapping("/zodiac/special/straw")
    public String straw(){return "/zodiac/special/dark/straw";} // 스트라

    @GetMapping("/zodiac/special/angler")
    public String angler(){return "/zodiac/special/dark/angler";} // 낚시꾼

    @GetMapping("/zodiac/special/vessel")
    public String vessel(){return "/zodiac/special/dark/vessel";} // 돛단배

    //전문화 - 광휘
    @GetMapping("/zodiac/special/sheen")
    public String sheen(){return "/zodiac/special/sheen/sheen";} // 광휘 시작 부분

    @GetMapping("/zodiac/special/vacuum")
    public String vacuum(){return "/zodiac/special/sheen/vacuum";} //진공

    @GetMapping("/zodiac/special/waterfall")
    public String waterfall(){return "/zodiac/special/sheen/waterfall";} // 폭포

    @GetMapping("/zodiac/special/pirate")
    public String pirate(){return "/zodiac/special/sheen/pirate";} // 해적

    //전문화 - 카스
    @GetMapping("/zodiac/special/caspol")
    public String caspol(){return "/zodiac/special/caspol/caspol";} //카스폴 시작 부분

    @GetMapping("/zodiac/special/lamplight")
    public String lamplight(){return "/zodiac/special/caspol/lamplight";} // 등불

    @GetMapping("/zodiac/special/regret")
    public String regret(){return "/zodiac/special/caspol/regret";} // 후회

    @GetMapping("/zodiac/special/brazier")
    public String brazier(){return "/zodiac/special/caspol/brazier";} // 화로


    // 전문화 - 그늘
    @GetMapping("/zodiac/special/shade")
    public String shade(){return "/zodiac/special/shade/shade";} //그늘 시작부분

    @GetMapping("/zodiac/special/craving")
    public String craving(){return "/zodiac/special/shade/craving";} // 욕망

    @GetMapping("/zodiac/special/ganida")
    public String ganida(){return "/zodiac/special/shade/ganida";}  // 가니다

    @GetMapping("/zodiac/special/brook")
    public String brook(){return "/zodiac/special/shade/brook";} // 개울
}

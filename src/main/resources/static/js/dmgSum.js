$(document).ready(function () {
    let attackAll =0;
    let attack;
    $("input.attackIc").click(function (){
        let attackIc = $(this).val();
        let attackSum = $("#attackDmg").val();
        if($(this).is(":checked")){
          attackAll += parseInt(attackIc);
        }else{
          attackAll -= parseInt(attackIc);
        }
        $("#attackDmg").val(attackAll);
        console.log(attackAll)
    })


    $(".content-body:not(.weapon)").hide();
    // 조디악 메인 페이지
    $(".zodiacMainPage").click(function () {
        $(".zodiacTab").show();
        $(".content-body:not(.zodiacTab)").hide();
    })
    // 무기 옵션
    $(".weaponPage").click(function () {
        $(".weapon").show();
        $(".content-body:not(.weapon)").hide();
    })
    // 조디악 상세 탭
    // t1
    $(".afros").click(function (){
        $(".afrosTab").show();
        $(".content-body:not(.afrosTab)").hide();
    })
    //t2
    $(".forest").click(function (){
        $(".forestTab").show();
        $(".content-body:not(.forestTab)").hide();
    })
    //t3
    $(".rock").click(function (){
        $(".rockTab").show();
        $(".content-body:not(.rockTab)").hide();
    })
    //t4
    $(".freere").click(function (){
        $(".freereTab").show();
        $(".content-body:not(.freereTab)").hide();
    })
    //t5
    $(".contrast").click(function (){
        $(".contrastTab").show();
        $(".content-body:not(.contrastTab)").hide();
    })
    //t6
    $(".nemera").click(function (){
        $(".nemeraTab").show();
        $(".content-body:not(.nemeraTab)").hide();
    })
    //t7
    $(".muckworm").click(function (){
        $(".muckwormTab").show();
        $(".content-body:not(.muckwormTab)").hide();
    })
    // $(".scent").click(function (){
        $(".scentTab").show();
    //     $(".content-body:not(.scentTab)").hide();
    // })
    //t8
    $(".plague").click(function (){
        $(".plagueTab").show();
        $(".content-body:not(.plagueTab)").hide();
    })
    // 전문화
    $(".hammer").click(function (){
        $(".hammerTab").show();
        $(".content-body:not(.hammerTab)").hide();
    })
    $(".anger").click(function (){
        $(".angerTab").show();
        $(".content-body:not(.angerTab)").hide();
    })
    $(".bonfire").click(function (){
        $(".bonfireTab").show();
        $(".content-body:not(.bonfireTab)").hide();
    })
    $(".flame").click(function (){
        $(".flameTab").show();
        $(".content-body:not(.flameTab)").hide();
    })
})

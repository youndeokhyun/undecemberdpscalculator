$(document).ready(function () {

    // 공격 시 피해
    let attackDmgAll =0;
    $("input.attackIc").click(function (){
        let attackIc = $(this).attr("value");
        if($(this).is(":checked")){
          attackDmgAll += parseInt(attackIc);
        }else{
          attackDmgAll -= parseInt(attackIc);
        }
        $("#attackDmg").val(attackDmgAll);
        console.log(attackDmgAll)
    })

    // 물리 피해
    let physicIcAll =0;
    $("input.attackIc").click(function (){
        let physicIc = $(this).attr("value");
        if($(this).is(":checked")){
            physicIcAll += parseInt(physicIc);
        }else{
            physicIcAll -= parseInt(physicIc);
        }
        $("#attackDmg").val(physicIcAll);
        console.log(physicIcAll)
    })

    // 그냥 피해
    let nomalDmgAll =0;
    $("input.nomalIc").click(function (){
        let nomalIc = $(this).attr("value");
        if($(this).is(":checked")){
            nomalDmgAll += parseInt(nomalIc);
        }else{
            nomalDmgAll -= parseInt(nomalIc);
        }
        $("#attackSpeedIc").val(nomalDmgAll);
        console.log(nomalDmgAll)
    })

    // 공격 속도 증가
    let attackSpeedAll =0;
    $("input.attackSpeedIc").click(function (){
        let attackSPeedIc = $(this).attr("value1");
        if($(this).is(":checked")){
            attackSpeedAll += parseInt(attackSPeedIc);
        }else{
            attackSpeedAll -= parseInt(attackSPeedIc);
        }
        $("#attackSpeedIc").val(attackSpeedAll);
        console.log(attackSpeedAll)
    })

    // 공격 속도 증폭
    let attackSpeedAcAll =0;
    $("input.attackSpeedIc").click(function (){
        let attackSPeedAc = $(this).attr("value1");
        if($(this).is(":checked")){
            attackSpeedAcAll += parseInt(attackSpeedAcAll);
        }else{
            attackSpeedAcAll -= parseInt(attackSpeedAcAll);
        }
        $("#attackSpeedAc").val(attackSpeedAcAll);
        console.log(attackSpeedAcAll)
    })


})

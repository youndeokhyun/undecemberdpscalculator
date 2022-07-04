$(document).ready(function () {
    let attackAll =0;
    $("input.attackIc").click(function (){
        let attackIc = $(this).attr("value");
        if($(this).is(":checked")){
          attackAll += parseInt(attackIc);
        }else{
          attackAll -= parseInt(attackIc);
        }
        $("#attackDmg").val(attackAll);
        console.log(attackAll)
    })

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
})

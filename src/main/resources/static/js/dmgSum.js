$(document).ready(function () {
    // let attackAll =0;
    // let attack;
    // $("input.attackIc").click(function (){
    //     let attackIc = $(this).val();
    //     let attackSum = $("#attackDmg").val();
    //     if($(this).is(":checked")){
    //       attackAll += parseInt(attackIc);
    //     }else{
    //       attackAll -= parseInt(attackIc);
    //     }
    //     $("#attackDmg").val(attackAll);
    //     console.log(attackAll)
    // })


    $(".content-body:not(.weapon)").hide();
    $(".zodiacMainPage").click(function () {
        $(".zodiacTab").show();
        $(".content-body:not(.zodiacTab)").hide();
    })
    $(".weaponPage").click(function () {
        $(".weapon").show();
        $(".content-body:not(.weapon)").hide();
    })
    $(".afros").click(function (){
        $(".afrosTab").show();
        $(".content-body:not(.afrosTab)").hide();
    })
})

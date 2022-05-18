$(document).ready(function (){
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
 })

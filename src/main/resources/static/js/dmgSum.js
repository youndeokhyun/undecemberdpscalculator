$(document).ready(function () {
     let attack = $(".attack").val()
     $(".attack").on("click" , function (){
         $("#attackDmg").val(attack);
         // $("#attackDmg").attr("value" , attack);
         console.log($(".attackDmg").val());

     })

})
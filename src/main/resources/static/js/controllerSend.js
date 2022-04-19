$(document).ready(function() {
    let  dmgIcArr = [];
    $("input[name=dmgIcPer]").on("click" , function (){

         $("input[name=dmgIcPer]:checked").each(function (){
             dmgIcArr.push($(this).val());
         })
    })
    // $(".submit").on("click" , function (){
    //
    //     $.ajax({
    //         url:"/"
    //         ,type: "post"
    //         ,dataType: "json"
    //         ,data: {
    //             dmgIcArr : dmgIcArr
    //         }
    //     });
    // })
})
$(document).ready(function() {
    $("input[name=dmgIcPer]").on("click" , function (){
        let  arr = [];
         $("input[name=dmgIcPer]:checked").each(function (){
             arr.push($(this).val());
             localStorage.setItem("attack" , JSON.stringify(arr));
         })


         // let num = 0;
         // for(let i = 0; i<arr.length; i++){
         //     num += Number(arr[i]);
         //     console.log(num)
         // }
    })
})
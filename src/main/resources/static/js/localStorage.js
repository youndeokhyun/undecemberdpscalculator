$(document).ready(function() {
    $("input[name=attack]").on("click" , function (){
        let arr = [];
         $("input[name=attack]:checked").each(function (){
             arr.push($(this).val());
             localStorage.setItem("attack" , JSON.stringify(arr));
         })
         let num = 0;
         for(let i = 0; i<arr.length; i++){
             num += Number(arr[i]);
             console.log(num)
         }
    })
})
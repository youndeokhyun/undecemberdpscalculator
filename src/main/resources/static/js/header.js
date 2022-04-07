$(document).ready(function(){
    $(".level").on("change keyup paste",function () {
        let lv = $(".level").val();
        $(this).attr("value", lv);
        $(".skillPoint").attr("value", lv);
        if(lv >= 101){
            alert("100렙이 만렙입니다");
            $(this).val(100);

        }
        localStorage.setItem("sp" , $(".level").val());

    })
    let lvv = localStorage.getItem("sp");
    $(".p").html(lvv);
    console.log(lvv);
    if($(".level").val() === 0){
        $(this).val(localStorage.getItem("sp"));
    }




})
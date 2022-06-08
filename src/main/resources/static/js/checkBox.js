$(document).ready(function (){
    // 처음을 제외한 모든 체크박스 비활성화

    $(".zodiacSkill").prop("disabled", true);
    $(".start").prop("disabled", false);

    $(".start").on("click" , function (){
        if($(this).is(":checked") === true){
            $(".first").prop("disabled" , false);
        }else{
            $(".zodiacSkill").prop("checked" , false);
            $(".zodiacSkill").prop("disabled" , true);
            $(".start").prop("disabled" , false);
        }
    })
    $(".last").on("click" , function (){
        if($(this).is(":checked") === true){
            $(".end").prop("disabled" , false);
        }

    })
    $(".end").change(function (){
        if($(this).is(":checked") === true){
            $(".last").prop("disabled" , false);
        }
    })

    $(".zodiacSkill").on("click" , function (){
        if($(this).is(":checked") === true){
            $(this).next().prop("disabled" , false);
            $(this).prev().prop("disabled" , false);
        }

    })

    // 체크시 다음 스킬 체크박스 활성화 및 다음스킬 페이지 활성화
    $(".zodiacSkill").on("click", function () {

        let usedSkillPoint = $(".usedSkillPoint").val();
        if ($(this).is(":checked") === true) {
            usedSkillPoint++
            localStorage.setItem("usp", usedSkillPoint);
        } else {
            usedSkillPoint--
            localStorage.setItem("usp", usedSkillPoint);
        }
        $(".usedSkillPoint").val(localStorage.getItem("usp"))
    })
    // 삼림
    $(".forestSe").on("click", function () {
        if ($(this).is(":checked") === true) {
            $(".center").prop("disabled", false)
        }
    })
    //프리레
    $(".zodiacSkill").on("click", function () {
        if ($(".first").is(":checked") === true) {
            $(".second").prop("disabled", false);
        }
        if($(".second").is(":checked") === true){
            $(".third").prop("disabled", false);
        }
        if($(".third").is(":checked") === true){
            $(".fourth").prop("disabled", false);
        }
    })
    //구더기
    $(".alone").prop("disabled" , false);
    $(".intBox").children('.secondInt').click(function () {
        if ($(this).is(":checked") === true) {
            $(".wideAreaIc").prop("disabled", false);
            $(".arrowIc").prop("disabled", false);
        }
    })
    $(".dexBox").children('.secondDex').click(function () {
        if ($(this).is(":checked") === true) {
            $(".meleeIc").prop("disabled", false);
            $(".arrowIc").prop("disabled", false);
        }
    })
    $(".strBox").children('.secondStr').click(function () {
        if ($(this).is(":checked") === true) {
            $(".meleeIc").prop("disabled", false);
            $(".wideAreaIc").prop("disabled", false);
        }
    })
    $(".wideAreaIc").click(function (){
        if($(this).is(":checked") === true) {
            $(".intBox").children('.secondInt').prop("disabled", false);
            $(".strBox").children('.secondStr').prop("disabled", false);
        }
    })
    $(".arrowIc").click(function (){
        if($(this).is(":checked") === true) {
            $(".intBox").children('.secondInt').prop("disabled", false);
            $(".dexBox").children('.secondDex').prop("disabled", false);
        }
    })
    $(".meleeIc").click(function (){
        if($(this).is(":checked") === true) {
            $(".dexBox").children('.secondDex').prop("disabled", false);
            $(".strBox").children('.secondStr').prop("disabled", false);
        }
    })
})
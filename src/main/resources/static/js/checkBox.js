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
        }else{
            $(this).nextAll().prop("checked" , false);
            $(this).nextAll().prop("disabled" , true);
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

})
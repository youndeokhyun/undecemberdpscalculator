$(document).ready(function () {
    //레벨에 따라 스킬포인트 수정
    $(".level").on("change keyup paste", function () {
        let lv = $(".level").val();
        $(".skillPoint").val(lv);
        if (lv >= 101) {
            alert("100렙이 만렙입니다");
            $(this).val(100);
            $(".skillPoint").val(100);
        } else if (lv < 0) {
            alert("0렙 미만 레밸은 없습니다")
            $(this).val(0);
            $(".skillPoint").val(0);
        }
        // localStorage 에 저장
        localStorage.setItem("lv", $(".level").val());
        localStorage.setItem("sp", $(".skillPoint").val());
    })


    // 저장한 값을 출력
    $(".level").val(localStorage.getItem("lv"));
    $(".skillPoint").val(localStorage.getItem("sp"));
    $(".usedSkillPoint").val(localStorage.getItem("usp"))


    //출력한 skillPoint를 체크박스 체크/해체 마다 1씩 감소/증가
    $("input[name=zodiacSkill]").change(function () {
        if ($(this).is(':checked')) {
            // 체크 해제 되는 갯수만큼 - + 되게 하기
            $(".skillPoint").val(parseInt(localStorage.getItem("sp")) - 1);
            if ($(".skillPoint").val() < 0) {
                alert("포인트를 모두 소진했습니다");
                $(this).val(0);
                $(".skillPoint").val(parseInt(localStorage.getItem("sp")) + 1);
                $(".zodiacSkill:checked").last().prop("checked", false);
            }
        } else {
            $(".skillPoint").val(parseInt(localStorage.getItem("sp")) + 1);
        }
        localStorage.setItem("sp", $(".skillPoint").val());
    })
    // 초기화 버튼
    $(".resetBtn").on("click", function () {
        if (confirm("정말 초기화 하시겠습니까?")) {
            localStorage.clear();
            $(".zodiacSkill").prop("checked", false);
            $(".level").val(0);
            $(".skillPoint").val(0);
            $(".usedSkillPoint").val(0);
            $("#attackDmg").val(0);
            $(".zodiacSkill").prop("disabled", true);
            $(".start").prop("disabled", false);
            cbLength = 0;
        } else {
            return
        }
    })


    // 체크시 다음 스킬 체크박스 활성화

    //
    // // 체크박스 체크한 개수에 따라 다음 스킬페이지 오픈
    // function nextSkillSDisabled() {
    //     switch (localStorage.getItem("usp")) {
    //         // 일반 스킬
    //         case 5 :
    //         case 10 :
    //         case 15 :
    //         case 29 :
    //         case 36 :
    //         case 52 :
    //         case 61 :
    //         // 전문화
    //         case 22 :
    //         case 45 :
    //         case 70 :
    //     }
    // }
})

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
    // 처음을 제외한 모든 체크박스 비활성화
    $(".a").prop("disabled", true);
    $("#start").prop("disabled", false);
    // 체크시 다음 스킬 체크박스 활성화 및 다음스킬 페이지 활성화
    let cbLength = 0
    $(".a").on("click", function () {

        let usedSkillPoint = $(".usedSkillPoint").val();
        if ($(this).is(":checked") === true) {
            usedSkillPoint++
            cbLength++
            localStorage.setItem("usp", usedSkillPoint);
        } else {
            usedSkillPoint--
            cbLength--
            localStorage.setItem("usp", usedSkillPoint);
        }
        $(".usedSkillPoint").val(localStorage.getItem("usp"))
        cbDisabled();
        console.log(cbLength)

    })

    // 저장한 값을 출력
    $(".level").val(localStorage.getItem("lv"));
    $(".skillPoint").val(localStorage.getItem("sp"));
    $(".usedSkillPoint").val(localStorage.getItem("usp"))


    //출력한 skillPoint를 체크박스 체크/해체 마다 1씩 감소/증가
    $(".a").change(function () {
        if ($(this).is(':checked')) {
            $(".skillPoint").val(parseInt(localStorage.getItem("sp")) - 1);
            if ($(".skillPoint").val() < 0) {
                alert("포인트를 모두 소진했습니다");
                $(this).val(0);
                $(".skillPoint").val(parseInt(localStorage.getItem("sp")) + 1);
                $(".a:checked").last().prop("checked", false);
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
            $(".a").prop("checked", false);
            $(".level").val(0);
            $(".skillPoint").val(0);
            $(".usedSkillPoint").val(0);
            $(".a").prop("disabled", true);
            $("#start").prop("disabled", false);
            cbLength = 0;
        } else {
            return
        }
    })
    // 체크시 다음 스킬 체크박스 활성화
    function cbDisabled() {
        switch (cbLength) {
            case 0:
                $("#start").prop("disabled", false);
                $(".first").prop("disabled" , true);
                break
            case 1:
                $(".first").prop("disabled", false);
                $(".second").prop("disabled", true);
                break
            case 2:
                $(".second").prop("disabled", false);
                $(".third").prop("disabled", true);
                break
            case 3:
                $(".third").prop("disabled", false);
                $(".fourth").prop("disabled", true);
                break
            case 4:
                $(".fourth").prop("disabled", false);
                $(".fifth").prop("disabled", true);
                break
            case 5:
                $(".fifth").prop("disabled", false);
                break
        }
    }
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

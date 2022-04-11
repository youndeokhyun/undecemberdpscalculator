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

    //출력한 skillPoint를 체크박스 체크/해체 마다 1씩 감소/증가
    $(".a").change(function () {
        if ($(this).is(':checked')) {
            $(".skillPoint").val(parseInt(localStorage.getItem("sp")) - 1);
            localStorage.setItem("sp", $(".skillPoint").val());
            if ($(".skillPoint").val() < 0) {
                alert("포인트를 모두 소진했습니다");
                $(this).val(0);
                $(".skillPoint").val(parseInt(localStorage.getItem("sp")) + 1);
                localStorage.setItem("sp", $(".skillPoint").val());
                $(".a:checked").last().prop("checked", false);
            }
        } else {
            $(".skillPoint").val(parseInt(localStorage.getItem("sp")) + 1);
            localStorage.setItem("sp", $(".skillPoint").val());
        }
    })
    // 체크시 다음 스킬 체크박스 활성화
    $(".a").prop("disabled" , true);
    $("#start").prop("disabled" , false);
    let cbLength = 0
    $(".a").change(function () {
         if ($(".a").is(":checked") === true) {
           cbLength++;
           $(".a").eq(cbLength).prop("disabled", false);
             alert("성공")
         }else {
             cbLength--;
             alert("헤제")
             $(".a").eq(cbLength).prop("disabled", true);
             if(cbLength === 0){
                 $("#start").prop("disabled" , false);
                 $(".a").eq(1).prop("disabled", true);
             }
         }
        console.log(cbLength);
    })
    // 초기화 버튼
    $(".resetBtn").on("click", function () {
        if (confirm("정말 초기화 하시겠습니까?")) {
            localStorage.clear();
            $(".a").prop("checked", false);
            $(".level").val(0);
            $(".skillPoint").val(0);
            $(".a").prop("disabled" , true);
            $("#start").prop("disabled" , false);
            cbLength = 0;
        } else {
            return
        }
    })


})

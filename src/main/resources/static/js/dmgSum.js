$(document).ready(function () {
    let attackArr = [];
    let attackAll;
    $(".attack").on("click", function () {
        $("input[name=attack]:checked").each(function () {
            attackArr.push($(this).val());     // 체크된 것만 값을 뽑아서 배열에 push
            console.log(attackArr);
        })
    })


    // $(".attack").on("click", function () {
    //     if($("input[name=attack]:checked")) {
    //         attackArr.push($(this).val());
    //         console.log(attackArr)
    //         for (let i = 0; i < attackArr.length; i++) {
    //             attackAll += Number(attackArr);
    //         }
    //         $("#attackDmg").val(attackAll);
    //     }
    // })
})


//
//     let attackAll;
//
//     $("#attackDmg").val(Number(attackAll));
//     $("#attackDmg").attr("value", attackAll);
//     console.log(attackAll);
//

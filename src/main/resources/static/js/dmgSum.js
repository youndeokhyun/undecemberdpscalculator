$(document).ready(function (){
    $("#attackDmg").val(localStorage.getItem("attack")); // 새로고침 및 재실행시  set 한거 다시 get
    $("input.attackIc").click(function (){
        let attackValue = $(".attackIc").attr("value")
        let attackSumValue = 0
        if($(this).is(":checked")){
            attackSumValue += attackValue;
        }
        console.log(attackSumValue)
        console.log(attackValue)
    })
})
// function dmgArr(){
//     let attackArr = []; // 체크 박스 배열
//     let attackSum = 0; // 체크박스 값의 합
//     let attack = $("#attackDmg").val()
//     let attackAll;  // 현제 attack 값과 체크박스의 합 +
//     $("input.attackIc:checked").each(function (){
//        attackArr.push($(this).attr("value"));
//     })
//     localStorage.setItem("attackArr" , String(attackArr))// localStorage 에 저장
//     for (let i = 0; i < attackArr.length; i++) {
//         attackSum += parseInt(attackArr[i]);
//     }
//     // attackAll = parseInt(attack) + attackSum  // 현제 attack 값과 체크박스의 합 +
//     // localStorage.setItem("attack" , attackAll)// localStorage 에 저장
//     // $("#attackDmg").val(attackAll)  //  #attackDmg 에 값 담기
//     // console.log(attackArr)
// }
function dmgSum(){
    $("input.attackIc").click(function (){
        let attackValue = $(".attackIc").attr("value")
        let attackSumValue = $("#attackDmg").val();
        if($(this).is(":checked")){
            attackSumValue += attackValue;
        }
        console.log(attackSumValue)
        console.log(attackValue)
    })
}
function speed(){

}

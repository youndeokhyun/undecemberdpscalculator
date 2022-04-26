$(document).ready(function (){
    $("#attackDmg").val(localStorage.getItem("attack")); // 새로고침 및 재실행시  set 한거 다시 get
    $(window).on("click" , function (e) {

    })
})

function dmgArr(){
    let attackArr = []; // 체크 박스 배열
    let attackSum = 0; // 체크박스 값의 합
    let attack = $("#attackDmg").val()
    let attackAll;  // 현제 attack 값과 체크박스의 합 +
    $("input[name=attackIc]:checked").each(function (){
        attackArr.push($(this).val());
    })
    for (let i = 0; i < attackArr.length; i++) {
        attackSum += parseInt(attackArr[i]);
    }
    // $("#attackDmg").val() 와 새로 체크된값 + 된걸 set;
    attackAll = parseInt(attack) + attackSum  // 현제 attack 값과 체크박스의 합 +
    $("#attackDmg").val(attackAll)  //  #attackDmg 에 값 담기
    localStorage.setItem("attack" , attackAll);   // localStorage 에 저장
    console.log(parseInt(attackAll));
}

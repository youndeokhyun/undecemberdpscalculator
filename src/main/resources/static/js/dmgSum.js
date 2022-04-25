function dmgArr(){
    let attackArr = [];
    let attackAll = 0;
    $("input[name=attack]:checked").each(function (){
        attackArr.push($(this).val());
    })
    for(let i = 0; i<attackArr.length; i++){
       attackAll += parseInt(attackArr[i]);
    }
    // $("#attackDmg").val() 와 새로 체크된값 + 된걸 set;
    $("#attackDmg").val(attackAll);
    localStorage.setItem("attack" , $("#attackDmg").val());
    console.log(attackAll);
}
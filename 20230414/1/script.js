window.onload = function () {
    changeStyle();
};
function changeStyle() {
    const myText = document.getElementsByClassName("myText");
    for (let i = 0; i < myText.length; i++) {
        myText[i].style.borderColor = "black";
        myText[i].style.borderStyle = "dotted";
        myText[i].style.borderWidth = "0 0 1px 0";
        myText[i].style.height = "20px";
    }
}
function showText() {
    const userName = document.getElementById("userName");
    const cellphone = document.getElementById("cellphone");
    const idNum = document.getElementById("idNum");
    let genderText = '';
    const gender = idNum.value[1];
    if (gender == 1) {
        genderText = "男生";
    } else if (gender == 2) {
        genderText = "女生";
    }
    const information = document.getElementById("information");
    information.innerHTML = `<h1>姓名：${userName.value}<br>
                            電話號碼：${cellphone.value}<br>
                            身分證字號：${idNum.value}<br>
                            使用者性別：${genderText} `;
}
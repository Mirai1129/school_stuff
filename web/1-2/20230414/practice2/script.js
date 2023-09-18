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
function sendInformation() {
    const height = document.getElementById("height");
    const weight = document.getElementById("weight");
    const borderColor = document.getElementById("borderColor");
    const backgroundColor = document.getElementById("backgroundColor");
    const information = document.getElementById("information");
    information.innerHTML = `邊長(長)：${weight.value}<br>
                            邊長(高)：${height.value}<br>
                            框線顏色：${borderColor.value}<br>
                            背景顏色：${backgroundColor.value}<br>
                            面積：${(height.value) * (weight.value)}<br>`
}
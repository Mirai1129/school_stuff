function test(){
    let classList = new Array(5);
    classList[0] = document.getElementById("class1").value;
    classList[1] = document.getElementById("class2").value;
    classList[2] = document.getElementById("class3").value;
    classList[3] = document.getElementById("class4").value;
    classList[4] = document.getElementById("class5").value;
    const information = document.getElementById("information");
    information.innerHTML = '';
    for (let i = 0; i < 5; i++){
        if (i % 2 == 0) {
            information.innerHTML += `Class${i+1}：${classList[i]}<br>`;
        }
    }
}
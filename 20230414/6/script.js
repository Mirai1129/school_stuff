function SendInformation() {
    const information = document.getElementById("information");
    let classList = new Array(5);
    classList[0] = document.getElementById("class1").value;
    classList[1] = document.getElementById("class2").value;
    classList[2] = document.getElementById("class3").value;
    classList[3] = document.getElementById("class4").value;
    classList[4] = document.getElementById("class5").value;

    let scoreList = new Array(5);
    scoreList[0] = document.getElementById("score1").value;
    scoreList[1] = document.getElementById("score2").value;
    scoreList[2] = document.getElementById("score3").value;
    scoreList[3] = document.getElementById("score4").value;
    scoreList[4] = document.getElementById("score5").value;

    let classScoreList = [];
    for (let i = 0; i < classList.length; i++) {
        classScoreList.push([classList[i], scoreList[i]]);
    }
    information.innerHTML = "";
    for (i = 0; i < 5; i++) {
        information.innerHTML += `<h1>${classScoreList[i][0]} ${classScoreList[i][1]}<br>`;
    }
    console.log(classScoreList);
}

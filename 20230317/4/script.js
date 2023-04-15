// 要求使用者輸入姓名和身分證字號
const name = prompt("請輸入姓名:");
const id = prompt("請輸入身分證字號:");

// 判斷出生地
let birthPlace;
switch (id.charAt(0)) {
    case "A":
        birthPlace = "台北市";
        break;
    case "B":
        birthPlace = "台中市";
        break;
    case "C":
        birthPlace = "基隆市";
        break;
    case "D":
        birthPlace = "台南市";
        break;
    case "E":
        birthPlace = "高雄市";
        break;
    case "F":
        birthPlace = "台北縣";
        break;
    case "G":
        birthPlace = "宜蘭縣";
        break;
    case "H":
        birthPlace = "桃園縣";
        break;
    case "I":
        birthPlace = "嘉義市";
        break;
    case "J":
        birthPlace = "新竹縣";
        break;
    case "K":
        birthPlace = "苗栗縣";
        break;
    case "L":
        birthPlace = "台中縣";
        break;
    case "M":
        birthPlace = "南投縣";
        break;
    case "N":
        birthPlace = "彰化縣";
        break;
    case "O":
        birthPlace = "新竹市";
        break;
    case "P":
        birthPlace = "雲林縣";
        break;
    case "Q":
        birthPlace = "嘉義縣";
        break;
    case "R":
        birthPlace = "台南縣";
        break;
    case "S":
        birthPlace = "高雄縣";
        break;
    case "T":
        birthPlace = "屏東縣";
        break;
    case "U":
        birthPlace = "花蓮縣";
        break;
    case "V":
        birthPlace = "台東縣";
        break;
    case "W":
        birthPlace = "金門縣";
        break;
    case "X":
        birthPlace = "澎湖縣";
        break;
    case "Y":
        birthPlace = "陽明山";
        break;
    case "Z":
        birthPlace = "連江縣";
        break;
}

// 判斷性別
const gender = (id.charAt(1) % 2 === 0) ? "女" : "男";

// 在網頁上顯示結果
const outputDiv = document.createElement("div");
outputDiv.innerHTML = `
  <p>您的姓名為：${name}</p>
  <p>您的身分證字號為：${id}</p>
  <p>您的出生地為：${birthPlace}</p>
  <p>您的性別為：${gender}</p>
`;
document.body.appendChild(outputDiv);

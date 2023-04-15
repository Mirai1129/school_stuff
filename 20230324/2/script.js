function checkGender(id) {
  var secondLetter = id.substr(1, 1);
  if (secondLetter === "1") {
    return "男性";
  } else if (secondLetter === "2") {
    return "女性";
  } else {
    return "身分證字號錯誤";
  }
}

function showInput() {
  var name = prompt("請輸入您的姓名");
  var phone = prompt("請輸入您的電話");
  var id = prompt("請輸入您的身份證字號");
  var gender = checkGender(id);

  var outputDiv = document.getElementById("output");
  outputDiv.innerHTML += "姓名：" + name + "<br>";
  outputDiv.innerHTML += "電話：" + phone + "<br>";
  outputDiv.innerHTML += "身份證字號：" + id + "<br><hr>";
  outputDiv.innerHTML += "性別：" + gender + "<br>";
}

showInput();
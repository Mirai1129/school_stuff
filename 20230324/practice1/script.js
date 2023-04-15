const name = prompt("請輸入姓名");
const age = prompt("請輸入年齡");
const phoneNum = prompt("請輸入電話號碼");
const mail = prompt("請輸入信箱");

const outputDiv = document.createElement("div");
outputDiv.innerHTML = `
  <p>姓名：<span style="color: red">${name}</span></p>
  <p>年齡：<span style="color: red">${age}</span></p>
  <p>電話：<span style="color: red">${phoneNum}</span></p>
  <p>E-mail：<span style="color: red">${mail}</span></p>
`;
document.body.appendChild(outputDiv);
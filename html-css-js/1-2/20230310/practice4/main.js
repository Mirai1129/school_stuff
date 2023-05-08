import prompt from "prompt";//node.js
const income = prompt("請輸入您的所得：");
let tax = 0;

switch (true) {
    case (income <= 500_000):
        tax = income * 0.05;
        break;
    case (income > 500_000 && income <= 1_130_000):
        tax = income * 0.12;
        break;
    case (income > 1_130_000 && income <= 2_260_000):
        tax = income * 0.2;
        break;
    case (income > 2_260_000 && income <= 4_230_000):
        tax = income * 0.3;
        break;
    default:
        tax = income * 0.4;
}

console.log(`您的所得為 ${income} 元，所需納稅為 ${tax} 元。`);

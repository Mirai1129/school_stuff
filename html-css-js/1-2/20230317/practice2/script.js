const Apple = 10;
const Orange = 20;
const Strawberry = 150;

function exchangeRateApple(money) {
    let exchangeValue = Apple * money;
    let exchangeRateElem = document.getElementById("apple-rate");
    if (exchangeValue >= 100) {
        exchangeRateElem.innerHTML = `<span style="color:red">${exchangeValue}</span>`;
    } else {
        exchangeRateElem.innerHTML = `<span style="color:green">${exchangeValue}</span>`;
    }
}

function exchangeRateOrange(money) {
    let exchangeValue = Orange * money;
    let exchangeRateElem = document.getElementById("orange-rate");
    if (exchangeValue >= 100) {
        exchangeRateElem.innerHTML = `<span style="color:red">${exchangeValue}</span>`;
    } else {
        exchangeRateElem.innerHTML = `<span style="color:green">${exchangeValue}</span>`;
    }
}

function exchangeRateStrawberry(money) {
    let exchangeValue = Strawberry * money;
    let exchangeRateElem = document.getElementById("strawberry-rate");
    if (exchangeValue >= 100) {
        exchangeRateElem.innerHTML = `<span style="color:red">${exchangeValue}</span>`;
    } else {
        exchangeRateElem.innerHTML = `<span style="color:green">${exchangeValue}</span>`;
    }
}

const Input = prompt("請輸入錢錢");

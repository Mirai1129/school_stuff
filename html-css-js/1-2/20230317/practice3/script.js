function getUserInput() {
    const userInput = prompt("請輸入資料:");
    const outputDiv = document.getElementById("output");

    const dataType = typeof userInput;
    const asInteger = parseInt(userInput);
    const asFloat = parseFloat(userInput);
    const asHexadecimal = parseInt(userInput, 16);
    const asDecimal = parseInt(userInput, 10);
    const asOctal = parseInt(userInput, 8);

    let outputStr = `你輸入的資料為: ${userInput}<br>`;
    outputStr += `你輸入的資料型態為: ${dataType}<br>`;
    outputStr += `你輸入的資料，以整數顯示: ${asInteger}<br>`;
    outputStr += `你輸入的資料，以符點數顯示: ${asFloat}<br>`;
    outputStr += `你輸入的資料，以16進位顯示: ${asHexadecimal}<br>`;
    outputStr += `你輸入的資料，以10進位顯示: ${asDecimal}<br>`;
    outputStr += `你輸入的資料，以8進位顯示: ${asOctal}<br>`;

    outputDiv.innerHTML = outputStr;
}

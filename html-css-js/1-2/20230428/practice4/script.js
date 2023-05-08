function addItemDc() {
    // 取得使用者輸入的項目
    var input = document.getElementById("item-input");
    var item = input.value;
    // 確認項目不為空
    if (item.trim() === "") {
        alert("項目不能為空！");
        return;
    }
    // 取得要加入項目的清單
    var list = document.getElementById("DC-list");
    // 新增一個 li 元素，並加入項目文字
    var li = document.createElement("li");
    li.innerHTML = item;
    li.classList.add("newItems"); // 加入 class 屬性
    // 將 li 元素加入清單中
    list.appendChild(li);
    // 清空輸入框
    input.value = "";
}

function addItemDisney() {
    // 取得使用者輸入的項目
    var input = document.getElementById("item-input");
    var item = input.value;
    // 確認項目不為空
    if (item.trim() === "") {
        alert("項目不能為空！");
        return;
    }
    // 取得要加入項目的清單
    var list = document.getElementById("Disney-list");
    // 新增一個 li 元素，並加入項目文字
    var li = document.createElement("li");
    li.innerHTML = item;
    li.classList.add("newItems"); // 加入 class 屬性
    // 將 li 元素加入清單中
    list.appendChild(li);
    // 清空輸入框
    input.value = "";
}

function deleteItems(kind) {
    if (kind === "delete") {
        // 取得要刪除的項目清單
        var input = document.getElementById("item-input");
        // 刪除清單中的所有項目
        input.value = "";
    } else if (kind === "delete-DC") {
        const DC = document.querySelector("#DC-list");
        DC.innerHTML = "";
    } else if (kind === "delete-Disney") {
        const Disney = document.querySelector("#Disney-list");
        Disney.innerHTML = "";
    }
}

// function submitItems() {
//     // 取得要提交的項目清單
//     var list = document.getElementById("item-input");
//     // 將清單轉換為字串，以便提交
//     var items = "";
//     for (var i = 0; i < list.children.length; i++) {
//         var item = list.children[i].innerHTML;
//         items += item + "\n";
//     }
//     // 做一些提交的操作，這裡只是將結果顯示在 alert 中
//     alert("以下為提交的項目：\n\n" + items);
//     // 清空清單和輸入框
//     deleteItems();
//     document.getElementById("item-input").value = "";
// }

function handleClick(button) {
    if (button === "addDc") {
        addItemDc();
    } else if (button === "addDisney") {
        addItemDisney();
    } else if (button === "delete") {
        deleteItems(button);
    } else if (button === "delete-DC") {
        deleteItems(button);
    } else if (button === "delete-Disney") {
        deleteItems(button);
    }
}
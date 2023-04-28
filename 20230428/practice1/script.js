function sendInformation(){
    const getInput = document.getElementsByTagName("input");
    const getButton = document.getElementsByTagName("button");
    const getLabel = document.getElementsByTagName("label");
    const information = document.getElementById("information");

    
    information.innerHTML = `這個網頁的Input元件有 ${getInput.length}<br>
                            這個網頁的Button元件有 ${getButton.length}<br>
                            這個網頁的Label元件有 ${getLabel.length}`
}
function sendInformation() {
    const userName = document.querySelector("#userName");
    const userPhoneNum = document.querySelector("#cellphone");
    const userIdNum = document.querySelector("#idNum");
    const userWebsite = document.querySelector("#website");
    const information = document.querySelector("#information");

    information.innerHTML = `User Name：${userName.value}<br>
                            User Phone Number：${userPhoneNum.value}<br>
                            User ID Number：${userIdNum.value}<br>
                            User Website：${userWebsite.value}
                            `
}
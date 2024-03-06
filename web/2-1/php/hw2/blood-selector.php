<?php
$blood_a = isset($_POST['blood-a']) ? $_POST['blood-a'] : '';
$blood_b = isset($_POST['blood-b']) ? $_POST['blood-b'] : '';
$blood_ab = isset($_POST['blood-ab']) ? $_POST['blood-ab'] : '';
$blood_o = isset($_POST['blood-o']) ? $_POST['blood-o'] : '';


echo "<p>你的血型是：</p>";
if ($blood_a !== '') {
    echo "<p>A型</p><br>";
}
if ($blood_b !== '') {
    echo "<p>B型</p><br>";
}
if ($blood_ab !== '') {
    echo "<p>AB型</p><br>";
}
if ($blood_o !== '') {
    echo "<p>O型</p><br>";
}
?>
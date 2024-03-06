<?php
$student1 = $_POST['student1'];
$student2 = $_POST['student2'];
$student3 = $_POST['student3'];
$displayOption = $_POST['displayOption'];

$averageScore = ($student1 + $student2 + $student3) / 3;

if ($displayOption === 'pass_status') {
    $passStatus = ($student1 >= 60 && $student2 >= 60 && $student3 >= 60) ? "全部及格！" : "有同學沒有及格。";
    echo "<p>及格狀況： $passStatus</p>";
} elseif ($displayOption === 'average_score') {
    $formattedAverage = number_format($averageScore, 2);
    echo "<p>平均分數： $formattedAverage</p>";
} else {
    echo "<p>未選擇顯示選項。</p>";
}
?>
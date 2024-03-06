<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $movie = isset($_POST['watch-movie']) ? $_POST['watch-movie'] : '';
    $music = isset($_POST['listen-music']) ? $_POST['listen-music'] : '';
    $ball = isset($_POST['play-ball']) ? $_POST['play-ball'] : '';
    $photo = isset($_POST['take-photo']) ? $_POST['take-photo'] : '';
    $php = isset($_POST['php-program']) ? $_POST['php-program'] : '';

    $count = 0;

    echo "<p>你選擇的興趣是：</p>";

    if ($movie !== '') {
        echo "<p>看電影</p><br>";
        $count++;
    }
    if ($music !== '') {
        echo "<p>聽音樂</p><br>";
        $count++;
    }
    if ($ball !== '') {
        echo "<p>打球</p><br>";
        $count++;
    }
    if ($photo !== '') {
        echo "<p>攝影</p><br>";
        $count++;
    }
    if ($php !== '') {
        echo "<p>寫php程式</p><br>";
        $count++;
    }

    echo "<p>你共選擇了 " . $count . " 項興趣。</p>";
}
?>
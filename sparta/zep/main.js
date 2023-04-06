App.onJoinPlayer.Add(function (player) {

    let mbtis = ["ENTJ", "ESTJ", "INFP", "ISTP"];

    let nth = Math.floor(Math.random() * mbtis.length);

    player.moveSpeed = 300;
    player.title = mbtis[nth];
    player.sendUpdated();

})
let spartan = App.loadSpritesheet('spartan.png', 64, 96, {
    left: [0, 1, 2, 3], // left 라는 이미 정해진 왼쪽 방향으로 걸을 때의 애니메이션 이름
    up: [0], // 그 이름에 쓰일 전체 파일에서의 인덱스 넘버들
    down: [0],
    right: [0, 1, 2, 3],
}, 8); // 1초에 8장으로 한다.

// 플레이어가 입장할 때(listen), 바로 spartan 그림으로 교체줍니다(action)
App.onJoinPlayer.Add(function (player) {

    player.sprite = spartan;
    // 플레이어 속성이 변경되었으므로 호출해서 실제 반영해준다.
    player.sendUpdated();

})

// onSay 메소드를 통해 어떤 유저인지와 유저가 채팅창에 입력한 값을 받아올 수 있습니다.

App.onSay.Add(function (player, text) {

    if (text == 'speed up') {
        player.moveSpeed = 400;
    }
    if (text == 'speed down') {
        player.moveSpeed = 30;
    }

    let message = player.name + ' 님이' + text + '(이)라고 말했습니다';
    App.showCenterLabel(message)
})
let cloud = App.loadSpritesheet("cloud.png", 659, 400, [0], 6);

App.onJoinPlayer.Add(function () {
    Map.putObject(5, 5, cloud);
    Map.moveObject(5, 5, 100, 5, 34);
})


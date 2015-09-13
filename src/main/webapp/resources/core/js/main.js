var counter = document.getElementById('counter');
var tRex = document.getElementById('t-rex');
var responseText = document.getElementById('rt');
var position = 0;

function gameLoop() {

    $.post("http://localhost:8080/position",
        {position: position},
        function(data, status){
        });


}

var framesPerSecond = 1000 / 60;
window.setInterval(gameLoop, framesPerSecond);
var tRex = document.getElementById('t-rex');

function gameLoop() {
    $.ajax({
        url : 'http://localhost:8080/position.html',
        success : function(data) {
            var tokens = data.split(" ");
            tRex.style.left = tokens[0] + "px";
            tRex.style.top = tokens[1] + "px";
        }
    });
}

var framesPerSecond = 1000 / 60;
window.setInterval(gameLoop, framesPerSecond);
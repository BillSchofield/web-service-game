var counter = document.getElementById('counter');
var tRex = document.getElementById('moving-t-rex');

var position = 0;

function gameLoop() {
    counter.innerHTML = position;
    tRex.style.left = position + "px";
    tRex.style.top = "300px";
    position = position + 2;

    function ajaxCall() {
        xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            //ajaxCall();
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("txtHint").innerHTML = xmlhttp.responseText;
            }
        };
        xmlhttp.open("GET", "ajax_info.txt", true);
        xmlhttp.send();
    }
}

var framesPerSecond = 1000 / 60;
window.setInterval(gameLoop, framesPerSecond);
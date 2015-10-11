"use strict";

var game = game || {};

game.loop = function(spec){
    var that = {};
    var context = spec.context;
    var player = spec.player;
    var enemy = spec.enemy;

    that.run = function(window) {
            function gameLoop() {
                context.clearRect(0, 0, 1280, 1024);
                player.update();
                player.draw();
                enemy.update();
                enemy.draw();
            }

            var framesPerSecond = 1000 / 60;
            window.setInterval(gameLoop, framesPerSecond);
    };

    return that;
};
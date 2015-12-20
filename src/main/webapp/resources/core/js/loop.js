"use strict";

var game = game || {};

game.loop = function(spec){
    var that = {};
    var context = spec.context;
    var entityFactory = spec.entityFactory;

    function getEntities() {
        $.get("http://localhost:8080/entities",
            function (data, status) {
                data.each(
                    function(entity){
                        var tokens = data.split(" ");
                        position = game.vector2d({x: tokens[0], y: tokens[1]});
                        rotation = tokens[2];
                        var id = 1;
                        var entity = entityFactory.create(game.vector2d({x: 200, y: 200}), id)
                        entity.draw()
                    }
                );
            }
        );

    }

    that.run = function(window) {
            function gameLoop() {
                context.clearRect(0, 0, 1280, 1024);
                var entities = getEntities();
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
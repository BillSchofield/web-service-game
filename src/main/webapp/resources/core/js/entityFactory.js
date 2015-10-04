"use strict";

var game = game || {};

game.entityFactory = function(spec){
    var that = {};

    var context = spec.context;

    that.create = function() {
        return game.entity2d({
            position: game.vector2d({x: 0, y: 200}),
            rotation: 0,
            sprite: game.sprite({
                context: context,
                imageSource: '/resources/img/enemyShip.png'
            })
        });
    };

    return that;
};
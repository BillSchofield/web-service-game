"use strict";

var game = game || {};

game.entityFactory = function(spec){
    var that = {};

    var context = spec.context;

    that.create = function(position, id) {
        return game.entity2d({
            position: position,
            rotation: 0,
            sprite: game.sprite({
                context: context,
                imageSource: '/resources/img/playerShip.png'
            }),
            id: id
        });
    };

    return that;
};
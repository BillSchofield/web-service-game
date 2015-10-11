"use strict";

var game = game || {};

game.runner = function(spec){
    var that = {};
    var document = spec.document;
    var canvas = document.getElementById('canvas');
    var context = canvas.getContext('2d');
    var entityFactory = game.entityFactory({context: context});
    var player = entityFactory.createPlayer();
    var enemy = entityFactory.createEnemy();
    $(document.body).on('keydown', game.keyPressEventHandler({player:player}).handle);
    that.go = game.loop({context:context, player:player, enemy: enemy}).run;
    return that;
};
"use strict";

var game = game || {};

game.runner = function(spec){
    var that = {};
    var document = spec.document;
    var canvas = document.getElementById('canvas');
    var context = canvas.getContext('2d');
    var ship = game.entityFactory({context:context}).create();

    $(document.body).on('keydown', game.keyPressEventHandler({entity:ship}).handle);
    that.go = game.loop({context:context, entity:ship}).run;
    return that;
};
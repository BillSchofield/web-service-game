"use strict";

var game = game || {};

game.keyPressEventHandler = function(spec){
    var that = {};

    var player = spec.player;

    var keyResponses = {
        37 : function(player){player.rotateLeft();},
        38 : function(player){player.accelerate();},
        39 : function(player){player.rotateRight();},
        40 : function(player){player.stop();}
    };

    that.handle = function(event) {
        var keyPress = event.which;
        if (keyPress in keyResponses) {
            keyResponses[keyPress](player);
        }
    };

    return that;
};
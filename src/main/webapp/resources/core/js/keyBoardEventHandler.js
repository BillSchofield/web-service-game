"use strict";

var game = game || {};

game.keyPressEventHandler = function(spec){
    var that = {};

    var entity = spec.entity;

    var keyResponses = {
        37 : function(entity){entity.rotateLeft();},
        38 : function(entity){entity.accelerate();},
        39 : function(entity){entity.rotateRight();},
        40 : function(entity){entity.stop();}
    };

    that.handle = function(event) {
        var keyPress = event.which;
        if (keyPress in keyResponses) {
            keyResponses[keyPress](entity);
        }
    };

    return that;
};
"use strict";

var game = game || {};

game.sprite = function(spec){
    var that = {};

    var image = new Image();
    image.src = spec.imageSource;
    var context = spec.context;
    var PI2 = 2 * 3.1415926535;

    that.draw = function(position, angleInRadians) {
        var x = position.getX();
        var y = position.getY()
        var width = image.width;
        var height = image.height;

        context.translate(x, y);
        context.rotate(angleInRadians);
        context.drawImage(image, -width / 2, -height / 2, width, height);
        context.rotate(-angleInRadians);
        context.translate(-x, -y);
    };

    return that;
};
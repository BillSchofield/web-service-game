"use strict";

var game = game || {};

game.entity2d = function (spec) {
    var that = {};

    var step = 5;
    var position = spec.position;
    var rotation = spec.rotation;
    var sprite = spec.sprite;
    var id = spec.id;

    that.update = function () {
        $.ajax({
            url: 'http://localhost:8080/position.html',
            success: function (data) {
                var tokens = data.split(" ");
                var x = 1 * id * tokens[0];
                position = game.vector2d({x: x, y: tokens[1]});
                rotation = tokens[2];
            }
        });

    };

    that.draw = function () {
        sprite.draw(position, rotation);
    };

    that.getX = function () {
        return position.getX();
    };

    that.getY = function () {
        return position.getY();
    };

    that.rotateLeft = function () {
        $.post("http://localhost:8080/rotate.html",
            {
                delta: "-10"
            },
            function (data, status) {
            });
    };

    that.rotateRight = function () {
        $.post("http://localhost:8080/rotate.html",
            {
                delta: "10"
            },
            function (data, status) {
            });
    };

    that.accelerate = function () {
        $.post("http://localhost:8080/accelerate.html",
            {},
            function (data, status) {
            });
    };

    that.stop = function () {
        $.post("http://localhost:8080/stop.html",
            {},
            function (data, status) {
            });
    };

    return that;
}
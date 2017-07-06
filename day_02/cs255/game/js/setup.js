var canvas = null;
var context = null;
var assets = [
    "img/robot-1.png",
    "img/robot-2.png",
    "img/robot-3.png",
    "img/robot-4.png"
];

var frames = [];
var currentFrame = 0;
var frameRate = 1000 / 10;

var setup = function () {
    var body = document.getElementById("body");

    canvas = document.createElement("canvas");
    canvas.id = "my_canvas";
    context = canvas.getContext("2d");
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;

    var assetsLen = assets.length;
    for (var i = 0; i < assetsLen; i++) {
        frames.push(new Image);
        frames[i].onload = onImageLoad;
        frames[i].src = assets[i];
    }

    setInterval(animate, frameRate);

    body.insertBefore(canvas, body.firstChild);
}

var onImageLoad = function () {
    console.log("image was loaded");
}

var animate = function () {
    context.clearRect(0, 0, canvas.width, canvas.height);
    context.drawImage(frames[currentFrame], 0, 0);
    currentFrame = (currentFrame + 1) % frames.length;
}

setup();

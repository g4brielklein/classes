// Hoisting

const sayHey = () => {
    console.log("Hey!");
}

sayHey();

sayHi();

function sayHi() {
    console.log("Hi!");
}

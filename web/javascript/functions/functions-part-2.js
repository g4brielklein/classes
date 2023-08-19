// Sum function
function sum(number1 = 0, number2 = 0) {
    return number1 + number2
}

console.log(sum(2, 5))

// Double function
let double = function(x) {
    return x * 2
}

console.log(double(15))

// Factorial function
function calcFactorial(number) {
    let factorial = 1

    for (let c = number; c > 1; c--) {
        factorial *= c
    }

    return factorial
}

console.log(calcFactorial(5))

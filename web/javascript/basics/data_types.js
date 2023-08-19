// String
console.log("JavaScript");

// '' - Single quotes
// "" - Double quotes
// `` - Template strings

const language = "JavaScript";

console.log(`Hey, ${language}`);

// Numbers
// Integers - 33
// Float - 12.5 
// Not a number - NaN

// Boolean
// true
// false

console.log(true)

// Objects
const keyboard = {
    color: 'silver',
    size: 'TKL',
    brand: 'Keychron',
    turnOn() {
        return 'Turning on...'
    }
};

console.log(keyboard.turnOn());

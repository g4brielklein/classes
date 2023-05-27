/*
    Create a function that verifies if an user is 
    over 18 years old or not
*/

// Importing prompt
const prompt = require("prompt-sync")({ sigint: true });

// Assigning typed values to variables
const name = prompt("Type your name: ")
const age = prompt("Type your age: ")

function verifyAge(age) {
    if (age >= 18 ) {
        console.log(`${name}'s over 18`)
    } else {
        console.log(`${name} isn't over 18 yet` )
    }
}

// Calling function
verifyAge(age)

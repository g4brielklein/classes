// Prompt import
const prompt = require("prompt-sync")({ sigint: true });

// Creating an array to store games
var games = [];

// Repeat 6 times
for (let game = 1; game < 7; game++) {
    // Insert items to the array
    games.push(prompt(`Insert the game number ${game}: `))
}

// Show array
console.log(games);

const languages = ["JS", "Java", "C"];

function showLanguage(language) {
    console.log(language)
}

languages.forEach(showLanguage)

// --------

const numbers = [12, 8, 5];

let sum = 0

function sumNumbers(number) {
    sum = sum + number
}

numbers.forEach(sumNumbers)

console.log(sum)

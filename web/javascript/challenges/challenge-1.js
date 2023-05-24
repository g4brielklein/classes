// Create a program to calculate if a person is already able to retire or not

// Object
const person = {
    name: "Ana",
    gender: "M",
    age: 55,
    contribYears: 30
}

const sumAgeContribYears = person.age + person.contribYears

// Conditional statement
if (person.gender == 'M') {
    if (person.contribYears >= 35 && sumAgeContribYears >= 95) {
            console.log("You already can retire")
        } else {
            console.log("You can't retire yet")
        }
} else if (person.gender == 'F') {
    if (person.contribYears >= 30 && sumAgeContribYears >= 85) {
            console.log("You already can retire")
        } else {
            console.log("You can't retire yet")
        }
}

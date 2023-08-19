// Creating an object
const users = [
    {
        name: "Ana",
        techs: ["HTML", "JavaScript"]
    },
    {
        name: "João",
        techs: ["JavaScript", "NodeJS", "React"]
    },
    {
        name: "Pedro",
        techs: ["PHP", "Laravel"]
    }
]

function checkIfUserKnowsJS(user) {
    for (let tech of user.techs) {
        if (tech === "JavaScript") {
            console.log(`${user.name} knows JavaScript!`)
        }
    }
}

for (let user of users) {
    checkIfUserKnowsJS(user)
}

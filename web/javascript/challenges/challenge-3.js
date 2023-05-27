/*
    Create an object to store a programmer data, such as name, age, and known 
    technologies. A programmer can work with many technologies, so store them 
    using an array. The techs should be also objects, with name and speciality.
*/

const programmer = {
    name: "Daniel",
    age: 25,
    techs: [
        {
            name: "JavaScript",
            speciality: "Web/Mobile"
        },
        {
            name: "Python",
            speciality: "Data Science"
        }
    ]
}

console.log(`The programmer ${programmer.name}, is ${programmer.age} years old 
and work with ${programmer.techs[0].name} with speciality in ${programmer.techs[0].speciality}`)

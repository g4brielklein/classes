// Constructor

function Person(name) {
    this.name = name;
    this.walk = function() {
        return `${this.name} is walking`;
    }
}

const johnDoe = new Person("John Doe")

console.log(johnDoe.walk())

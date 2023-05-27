// Create an object to store a company data, and then log it using template strings

const company = {
    name: "Colégio Ulbra São Lucas",
    segment: "Education",
    address: {
        street: "Rua 25 de Julho",
        number: 564
    }
}

console.log(`The company ${company.name} is located at ${company.address.street}, number ${company.address.number}`);

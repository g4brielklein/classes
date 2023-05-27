/*
    Create an array of objects, each object being a customer, 
    and after that, for each customer calculate their balance, which is, 
    revenue - debts.
*/

const customers = [
    {
        name: "Paulo",
        revenue: 2000,
        debts: 1500,
        balance: 0
    },
    {
        name: "Maria",
        revenue: 7000,
        debts: 7500,
        balance: 0
    },
    {
        name: "Julia",
        revenue: 2000,
        debts: 2000,
        balance: 0
    },
    {
        name: "Rogerio",
        revenue: 4000,
        debts: 1500,
        balance: 0
    }
]

function calculateBalance(customer) {
    let revenue = customer.revenue;
    let debts = customer.debts;

    let balance = revenue - debts;

    return balance;
}

for (let customer of customers) {
    customer.balance = calculateBalance(customer)

    if (customer.balance > 0) {
        console.log(`${customer.name}'s balance is POSITIVE`)
    } else if (customer.balance < 0) {
        console.log(`${customer.name}'s balance is NEGATIVE`)
    } else {
        console.log(`${customer.name} doesn't have any balance`)
    }
}

/*
    Create a program that simulates a bank account. For that, create an object that will be 
    the account and a function to create transactions, such as debit and credit, that changes 
    the account balance.
*/

const user = {
    name: "CSL",
    transactions: [],
    balance: 0
}

function createTransaction(transaction) {
    user.transactions.push(transaction)

    // Verify which is the transaction type
    if (transaction.type == "credit") {
        user.balance = user.balance + transaction.value
    } else if (transaction.type == "debit") {
        user.balance = user.balance - transaction.value
    }
}

createTransaction({ type: 'credit', value: 4000 })
createTransaction({ type: 'credit', value: 15500.90 })
createTransaction({ type: 'debit', value: 500 })
createTransaction({ type: 'debit', value: 120 })

// ... => Spread Operator
console.log({ ...user, balance: user.balance.toFixed(2) })

// Create a function to show the biggest transaction value, based on type
function getBiggestTransactionByType(type) {
    let biggestValue = 0
    
    for (let transaction of user.transactions) {
        if (transaction.value > biggestValue && transaction.type == type) {
            biggestValue = transaction.value
        }

    }

    return { type: type, value: biggestValue }
}

console.log(getBiggestTransactionByType('credit'));

// Create a function that returns the average transaction value, no matter the type of it
function getAverageTransactionValue() {
    var sum = 0

    for (let transaction of user.transactions) {
        sum = sum + transaction.value
    }

    var average = sum / user.transactions.length

    return average.toFixed(2)
}

console.log(getAverageTransactionValue());

/*
    Create a function that returns the total number of transactions of each type (debit/credit), 
    the return must be an object and follow the structure below:

    {
        credits: X,
        debits: X
    }
*/

function getTransactionsCount() {
    let credits = 0
    let debits = 0

    for (let transaction of user.transactions) {
        if (transaction.type == "credit") {
            credits++;
        } else if (transaction.type == "debit") {
            debits++;
        }
    }
    
    return { credits, debits }
}

console.log(getTransactionsCount())

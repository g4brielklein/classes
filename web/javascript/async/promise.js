// Promise

let uberRequest = {
    accepted: true
}

console.log('Request an Uber')

const promiseExample = new Promise((resolve, reject) => {
    if (uberRequest.accepted) {
        return resolve('Uber arrived!');
    }

    return reject('Trip not accepted :(');
});

promiseExample.then(result => {
    console.log(result)
}).catch(error => {
    console.log(error)
}).finally(() => {
    setTimeout(() => {
        console.log('Uber trip completed')
    }, 2000)
});

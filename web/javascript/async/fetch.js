// npm install node-fetch@2

const fetch = require("node-fetch");

const response = fetch('https://api.github.com/users/g4brielklein')

response.then(response => {
    response.json()
    .then(data => {
        console.log(data.html_url)
    })
    .catch(() => {
        console.log('Error while getting response from url')
    })
})

function activate() {
    let now = new Date()
    let hour = now.getHours()
    let minutes = now.getMinutes()

    // Ternary operator in use: Add another 0 before minutes if minutes is one-digit only
    let fullHour = minutes >= 10 ? `${hour}:${minutes}` : `${hour}:0${minutes}`

    let time = document.getElementById('time-container')
    time.innerText = `Now is ${fullHour} hrs`
    
    let image = document.getElementById('image')
    
    if (hour < 12) {
        document.body.style.background = 'rgb(58, 157, 196)'
        image.src = 'https://t3.ftcdn.net/jpg/02/59/42/54/360_F_259425456_nuW385z4eGarWkyeSs0aLcvgB2vP7yul.jpg'
    } else if (hour < 18) {
        document.body.style.background = 'rgb(193, 191, 80)'
        image.src = 'https://images.unsplash.com/photo-1577257107590-fc448601f16a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YWZ0ZXJub29uJTIwc3VufGVufDB8fDB8fHww&w=1000&q=80'
    } else {
        document.body.style.background = 'rgb(32, 32, 39)'
        image.src = 'https://images.unsplash.com/photo-1617375996248-0e57941f3f3c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8bmlnaHQlMjB0aW1lfGVufDB8fDB8fHww&w=1000&q=80'
    }
}

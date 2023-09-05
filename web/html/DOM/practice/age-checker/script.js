function handleSubmit() {
    cleanReturnedData()

    let birthDate = document.getElementById('birth-date')

    let gender = document.querySelector('input[name="gender"]:checked').value

    let now = new Date()
    let currentYear = now.getFullYear()

    if ( birthDate.value > currentYear 
        || birthDate.value == 0 
        || birthDate.value < 1900) {
        alert('[Error] Birth year not valid')

        return
    }

    let age = currentYear - birthDate.value

    let person = ''

    let imageContainer = document.getElementById('image-container')

    let image = document.createElement('img')
    image.setAttribute('id', 'image')

    if (gender == 'f') {
        person = 'Woman'
        if (age < 12) {
            image.setAttribute('src', 'https://st2.depositphotos.com/1177973/8956/i/950/depositphotos_89561950-stock-photo-happy-little-girl-in-the.jpg')
        } else if (age < 25) {
            image.setAttribute('src', 'https://www.aeropostale.com/dw/image/v2/BBSG_PRD/on/demandware.static/-/Sites-master-catalog-aeropostale/default/dw01e24774/80174163_053_main.jpg?sw=478&sh=557&sm=fit&sfrm=jpg')
        } else if (age < 60) {
            image.setAttribute('src', 'https://media.istockphoto.com/id/1319763211/photo/thoughtful-black-woman-looking-outside-window.webp?b=1&s=170667a&w=0&k=20&c=UEJR89kPHJHfZYAQVxObIbioikE5hazLY8gyxiecQOU=')
        } else {
            image.setAttribute('src', 'https://advice.cdn.betterhelp.com/md/attractive-older-women-our-obsession-with-aging-well-1_.jpg.jpg')
        }
    } else if (gender == 'm') {
        person = 'Men'
        if (age < 12) {
            image.setAttribute('src', 'https://momlovesbest.com/wp-content/uploads/2022/10/asian-boy-names-450x300.webp')
        } else if (age < 25) {
            image.setAttribute('src', 'https://img.freepik.com/free-photo/portrait-smiling-male-teenager_171337-893.jpg?w=360')
        } else if (age < 60) {
            image.setAttribute('src', 'https://media.istockphoto.com/id/1147066751/photo/hispanic-adult-standing-outside-and-smiling.webp?b=1&s=170667a&w=0&k=20&c=GANqATIzO5fRtfi8ixfp-CiMdF7P69ftKbgioV1dcUQ=')
        } else {
            image.setAttribute('src', 'https://st.depositphotos.com/13649610/59664/i/450/depositphotos_596640538-stock-photo-milan-italy-september-2021-gianni.jpg')
        }
    }

    let description = document.getElementById('description')
    description.innerText = `Detected: ${person}, ${age} years old.`
    imageContainer.appendChild(image)

    function cleanReturnedData() {
        document.getElementById('description').innerText = 'Fill the fields and click submit to start!'
        
        let existingImage = document.getElementById('image')
        if (existingImage) {
            document.getElementById('image').remove()
        }
    }

}

// Creating numbers array
const numbers = [8, 7, 12, 20];

// Strings array
const strings = ["HTML", "CSS", "Javascript"]

// Using array
console.log(strings[2])

var spots = ['Car 4', 'Car 3', 'Car 5']

spots[3] = 'Car 1'
spots.push('Car 2')

console.log(spots.length)
spots.sort()

console.log(spots)

var index = spots.indexOf('Car 1')

if (index == -1) {
    console.log('Index not founded')
} else {
    console.log(`Index: ${index}`)
}

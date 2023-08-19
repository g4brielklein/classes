var now = new Date()
var weekdayNumber = now.getDay()
var weekday = ''

switch(weekdayNumber) {
    case 0:
        weekday = 'Sunday'
        break
    case 1:
        weekday = 'Monday'
        break
    case 2:
        weekday = 'Tuesday'
        break
    case 3:
        weekday = 'Wednesday'
        break
    case 4:
        weekday = 'Thursday'
        break
    case 5:
        weekday = 'Friday'
        break
    case 6:
        weekday = 'Saturday'
        break
    default:
        weekday = 'Error'
}   

console.log(weekday)

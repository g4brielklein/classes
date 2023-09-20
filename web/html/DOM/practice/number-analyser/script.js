const numbers = []
const select = document.querySelector('select');
const output = document.querySelector('.output');
const inputNumber = document.querySelector('#number');

function handleAddNumber() {
  const number = Number(document.querySelector('#number').value);

  if (number.length == 0) {
    return alert('You need to type a number to proceed');
  }

  if (numbers.indexOf(number) != -1) {
    return alert(`${number} is already added`)
  } else if (number > 100 || number < 0) {
    return alert('The number must be between 0 and 100')
  }

  numbers.push(number)

  const item = `Number ${number} was added`
  const option = document.createElement('option')
  option.innerText = item
  select.appendChild(option)

  inputNumber.value = ''
  inputNumber.focus()
  output.innerHTML = ''
}

function handleAnalyse() {
  if (numbers.length === 0) {
    return alert('Add at least one number to proceed')
  }

  output.innerHTML = `<p>Overall, there's ${numbers.length} numbers added</p>`
  
  output.innerHTML += `<p>The biggest one is ${getBiggestArrayNumber(numbers)}</p>`
  output.innerHTML += `<p>The smallest one is ${getSmallestArrayNumber(numbers)}</p>`
  output.innerHTML += `<p>Summing all numbers, we have ${sumAllArrayNumbers(numbers)}</p>`
  output.innerHTML += `<p>The average of inputed numbers is ${getAverageFromArrayNumbers(numbers)}</p>`
}

function getBiggestArrayNumber(array) {
  let biggestNumber = 0

  for (let number of array) {
    if (number > biggestNumber) {
      biggestNumber = number
    }
  }

  return biggestNumber
}

function getSmallestArrayNumber(array) {
  let smallestNumber = array[0]

  for (let number of array) {
    if (number < smallestNumber) {
      smallestNumber = number
    }
  }

  return smallestNumber
}

function sumAllArrayNumbers(array) {
  let sum = 0

  for (let number of array) {
    sum += number
  }

  return sum
}

function getAverageFromArrayNumbers(array) {
  let sum = 0

  for (let number of array) {
    sum += number
  }

  let arrayNumbersAverage = (sum / array.length)

  return arrayNumbersAverage.toFixed(2);
}

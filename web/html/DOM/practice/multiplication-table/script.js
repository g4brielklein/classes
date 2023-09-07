calculateMultiplicationTable = () => {
  const select = document.getElementById('mutiplication-table-select')
  let number = document.getElementById('number').value

  if (number === '') {
    return alert('You need to type a number first')
  }

  number = Number(number)

  select.innerHTML = ''

  for (let i = 1; i <= 10; i++) {
    let result = i * number

    let selectOption = document.createElement('option')
    selectOption.setAttribute('value', `${result}`)
    selectOption.innerText = `${i} X ${number} = ${result}`

    select.appendChild(selectOption);
  }
}

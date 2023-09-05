function handleCount() {
  const countButton = document.getElementById("count-button");
  let counterMessage = document.getElementById("counter-message");
  let counter = document.getElementById("counter");

  countButton.disabled = true;
  counterMessage.innerText = "Preparing counting...";
  counter.innerText = "";

  setTimeout(() => {
    const lock = {
      maxCountInterval: 1000,
      active: true, // Set false to disable max number lock
    };

    let start = document.getElementById("start").value;
    let end = document.getElementById("end").value;
    let increment = Number(document.getElementById("increment").value);

    if (start == "" || end == "") {
      alert("[Error]: You need to enter both start and end values");
    } else {
      start = Number(start);
      end = Number(end);
      increment = Number(increment);

      if (increment == 0) {
        increment = 1;
      }

      if (lock.active && Math.abs(start - end) > lock.maxCountInterval) {
        countButton.disabled = false;
        return alert(
          `The counting is locked for intervals greater than ${lock.maxCountInterval}`,
        );
      }

      if (start > end) {
        for (let i = start; i >= end; i -= increment) {
          let thereIsPrecedingNumber = i != end && i - increment >= end;
          let emoji = thereIsPrecedingNumber ? "👉" : "👉 🏴";

          counter.innerText += ` ${i} ${emoji}`;
        }
      } else {
        for (let i = start; i <= end; i += increment) {
          let thereIsNextNumber = i != end && i + increment <= end;
          let emoji = thereIsNextNumber ? "👉" : "👉 🏴";

          console.log(i);
          counter.innerText += ` ${i} ${emoji}`;
        }
      }
    }

    counterMessage.innerText = "Counting:";
    countButton.disabled = false;
  }, 200);
}

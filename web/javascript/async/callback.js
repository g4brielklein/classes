printData(
    () => {
        return "Callback";
    }
);

function printData(data) {
    console.log(data());
};
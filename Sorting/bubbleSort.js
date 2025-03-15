let arr = [13, 20, 9, 24, 46, 52];

function swapElements(arr, low, high) {
    let temp = arr[low];
    arr[low] = arr[high];
    arr[high] = temp;
}

for (let i = arr.length - 1; i >= 1; i--) {
    let swapped = false;
    for (let j = 0; j < i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            swapElements(arr, j, j + 1);
            swapped = true;
        }
    }
    if (swapped === false) {
        break;
    }
}

console.log(arr);


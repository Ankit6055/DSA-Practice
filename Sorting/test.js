let arr = [11, 32, 65, 9, 20]; // [9, 11, 20, 32, 65]

for (let i = 0; i < arr.length - 1; i++) {
    let min = i;
    for (let j = i; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
            min = j;
        }
    }
    let temp = arr[min];
    arr[min] = arr[i];
    arr[i] = temp;
}

console.log(arr);
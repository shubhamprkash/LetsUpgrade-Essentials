function findMax(numbers) {
    let max = numbers[0];                      // first item
    for (let i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {                // take item at index
            max = numbers[i];
        }
    }
    return max;                                // return without parentheses
}

const randomNumbers = [27, 64, 47, 78, 48, 11, 76, 25, 11, 83];
console.log(findMax(randomNumbers));

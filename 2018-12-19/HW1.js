function rand() {
    return Math.floor(Math.random() * 200);
}
function showArr(numArr) {
    console.log('arr is:');
    for (var i = 0; i < numArr.length; i++) {
        console.log(numArr[i]);
    }
}
function sumOfArr(numArr) {
    var sum = 0;
    for (var i = 0; i < numArr.length; i++) {
        sum += numArr[i];
    }
    console.log('sumOfArr', sum);
}
function avgOfArr(numArr) {
    var sum = 0;
    for (var i = 0; i < numArr.length; i++) {
        sum += numArr[i];
    }
    console.log('avgOfArr', sum / numArr.length);
}
function largestNum(numArr) {
    var largest = numArr[0];
    for (var i = 1; i < numArr.length - 1; i++) {
        if (numArr[i] > largest) {
            largest = numArr[i];
        }
    }
    console.log('largestNum', largest);
}
function smallestNum(numArr) {
    var smallest = numArr[0];
    for (var i = 1; i < numArr.length - 1; i++) {
        if (numArr[i] < smallest) {
            smallest = numArr[i];
        }
    }
    console.log('smallestNum', smallest);
}
function largestNumIdx(numArr) {
    var largest = numArr[0];
    var index = 0;
    for (var i = 1; i < numArr.length - 1; i++) {
        if (numArr[i] > largest) {
            largest = numArr[i];
            index = i;
        }
    }
    console.log('largestNumIdx', index);
}
function smallestNumIdx(numArr) {
    var smallest = numArr[0];
    var index = 0;
    for (var i = 1; i < numArr.length - 1; i++) {
        if (numArr[i] < smallest) {
            smallest = numArr[i];
            index = i;
        }
    }
    console.log('smallestNumIdx', index);
}
function sumOfOdd(numArr) {
    var sum = 0;
    for (var i = 0; i < numArr.length; i++) {
        if (numArr[i] % 2 == 1) {
            sum += numArr[i];
        }
    }
    console.log('sumOfOdd', sum);
}
function sumOfEven(numArr) {
    var sum = 0;
    for (var i = 0; i < numArr.length; i++) {
        if (numArr[i] % 2 == 0) {
            sum += numArr[i];
        }
    }
    console.log('sumOfEven', sum);
}
function numOfPos(numArr) {
    var index = 0;
    for (var i = 0; i < numArr.length; i++) {
        if (numArr[i] > 0) {
            index++;
        }
    }
    console.log('numOfPos', index);
}
function numOfZeros(numArr) {
    var index = 0;
    for (var i = 0; i < numArr.length; i++) {
        if (numArr[i] == 0) {
            index++;
        }
    }
    console.log('numOfZeros', index);
}
var numArr = new Array(10);
for (var i = 0; i < numArr.length; i++) {
    numArr[i] = rand();
}
showArr(numArr);
sumOfArr(numArr);
avgOfArr(numArr);
largestNum(numArr);
smallestNum(numArr);
largestNumIdx(numArr);
smallestNumIdx(numArr);
sumOfOdd(numArr);
sumOfEven(numArr);
numOfPos(numArr);
numOfZeros(numArr);

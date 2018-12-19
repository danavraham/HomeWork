
function rand () :number{
    return Math.floor(Math.random()*200);
} 

function showArr ( numArr:number[]) :void{
    console.log('arr is:');
    for (var i = 0; i < numArr.length; i++) {
        console.log(numArr[i]);
     }
}

function sumOfArr ( numArr:number[]) :void{
    let sum:number=0;

    for (var i = 0; i < numArr.length; i++) {
        sum+=numArr[i];
     }
     console.log('sumOfArr',sum);
}

function avgOfArr ( numArr:number[]) :void{
    let sum:number=0;

    for (var i = 0; i < numArr.length; i++) {
        sum+=numArr[i];
     }
     console.log('avgOfArr',sum/numArr.length);
}

function largestNum ( numArr:number[]) :void{
    let largest:number=numArr[0];

    for (var i = 1; i < numArr.length-1; i++) {
       if(numArr[i]>largest){
           largest=numArr[i];
       }
     }
     console.log('largestNum',largest);
}

function smallestNum ( numArr:number[]) :void{
    let smallest:number=numArr[0];

    for (var i = 1; i < numArr.length-1; i++) {
       if(numArr[i]<smallest){
        smallest=numArr[i];
       }
     }
     console.log('smallestNum',smallest);
}

function largestNumIdx ( numArr:number[]) :void{
    let largest:number=numArr[0];
    let index:number= 0;

    for (var i = 1; i < numArr.length-1; i++) {
       if(numArr[i]>largest){
           largest=numArr[i];
           index=i;
       }
     }
     console.log('largestNumIdx',index);
}

function smallestNumIdx ( numArr:number[]) :void{
    let smallest:number=numArr[0];
    let index:number= 0;

    for (var i = 1; i < numArr.length-1; i++) {
       if(numArr[i]<smallest){
        smallest=numArr[i];
        index=i;
       }
     }
     console.log('smallestNumIdx',index);
}

function sumOfOdd ( numArr:number[]) :void{
    let sum:number=0;

    for (var i = 0; i < numArr.length; i++) {
       if(numArr[i]%2==1){
        sum+=numArr[i];
       }
     }
     console.log('sumOfOdd',sum);
}

function sumOfEven ( numArr:number[]) :void{
    let sum:number=0;

    for (var i = 0; i < numArr.length; i++) {
       if(numArr[i]%2==0){
        sum+=numArr[i];
       }
     }
     console.log('sumOfEven',sum);
}

function numOfPos ( numArr:number[]) :void{
    let index:number=0;

    for (var i = 0; i < numArr.length; i++) {
       if(numArr[i]>0){
        index++;
       }
     }
     console.log('numOfPos',index);
}

function numOfZeros ( numArr:number[]) :void{
    let index:number=0;

    for (var i = 0; i < numArr.length; i++) {
       if(numArr[i]==0){
        index++;
       }
     }
     console.log('numOfZeros',index);
}





let numArr:number[]=new Array<number>(10);

for (let i = 0; i < numArr.length; i++) {
    numArr[i]=rand();
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

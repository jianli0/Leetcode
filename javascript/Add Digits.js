/**
 * @param {number} num
 * @return {number}
 */

var addDigits = function(num) {
    // debug
    console.log("num is " + num);
    res = 0
    while (Math.floor(num / 10) > 0){
        res += num % 10;
        num = Math.floor(num / 10);
    }
    res += Math.floor(num);

    if (Math.floor(res / 10) > 0){
        addDigits(res);
    }
    return res;
};

console.log(addDigits(38));


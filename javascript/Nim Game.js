/**
 * @param {number} n
 * @return {boolean}
 */
var canWinNim = function(n) {
    var dp = [];
    dp[1] = true;
    dp[2] = true;
    dp[3] = true;

    for (var i = 4; i <= n ; i++){
        dp[i] = ( !dp[i-3] || !dp[i-2] || !dp[i-1]);
    }
    return dp[n];

};

console.log(canWinNim(4))
console.log(canWinNim(5))

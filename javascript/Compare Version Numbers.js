/**
 * @param {string} version1
 * @param {string} versi,n,non2
 * @return {number}
 */

var compareVersion = function(version1, version2) {
    version1 = version1.split(".");
    version2 = version2.split(".");

    for (var i = 0; i < Math.max(version1.length,version2.length); i++){
        if (i < version1.length){
            var v1 = +version1[i];
        }else{
            var v1 = 0;
        }
        if (i < version2.length){
            var v2 = +version2[i];
        }else{
            var v2 = 0;
        }

        if (v1 > v2){
            return 1;
        }else if(v1 < v2){
        return -1;
        }
    }
    return 0;
};

console.log(compareVersion ("13.37","2.2.2"));
console.log(compareVersion ("1.0.1","1"));
// compareVersion(" "," ");

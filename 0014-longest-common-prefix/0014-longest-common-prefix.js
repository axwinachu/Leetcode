/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs.length==0 ||strs[0]=="")return ""
    if(strs.length==1) return strs[0]
    let ans="";
    for(let i=0;i<strs[0].length;i++){
        let don=strs[1].charAt(i)
        for(let each of strs){
            if(each[i]!=don){
            return ans;
            }
        }
        ans+=don
    }
    return ans;
}

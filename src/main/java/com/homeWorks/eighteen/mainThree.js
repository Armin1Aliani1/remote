var str = 0, bon = 0, num = 0, ary = 0;
var arry = ["[Five]", true, 35, "Java", [5, false]];
for (var i = 0; i < arry.length; i++) {
    if (Array.isArray(arry[i])) {
        ary++;
    } else if (typeof (arry[i]) == "number") {
        num++;
    } else if (typeof (arry[i]) == "string") {
        str++;
    } else if (typeof (arry[i]) == "boolean") {
        bon++;
    }

}

console.log("String: " + str)
console.log("Boolean: " + bon)
console.log("Number: " + num)
console.log("Array: " + ary)
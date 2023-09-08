var strArray = ["This", "is", "day3", "angular", "assignment"];
strArray.push("create dynamic");
strArray.push("string array");
strArray.push("and traverse");
strArray.forEach(function (String, index) {
    console.log(String + " ->is found at index " + index);
});

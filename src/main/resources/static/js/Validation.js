function checkLength(value, minlength, maxlength) {
    console.log(value, minlength,maxlength)
    if(minlength && maxlength){
        return value.length <= maxlength && value.length >= minlength
    }
    if(minlength){
        return value.length >= minlength
    }
    if(maxlength){
        return value.length <= maxlength
    }
}
function stringContainsNumber(_input) {
    let string1 = String(_input);
    for (let i = 0; i < string1.length; i++) {
        if (!isNaN(string1.charAt(i)) && !(string1.charAt(i) === " ")) {
            return true;
        }
    }
    return false;
}
function stringContainsOnlyNumber(_input) {
    let string1 = String(_input);
    for (let i = 0; i < string1.length; i++) {
        if (isNaN(string1.charAt(i)) || (string1.charAt(i) === " ")) {
            return false;
        }
    }
    return true;
}
function parseDate(str) {
    var t = str.match(/^(\d{2})\/(\d{2})\/(\d{4})$/);
    if(t !== null){
      var d = +t[1], m = +t[2], y = +t[3];
      var date = new Date(y, m - 1, d);
      if(date.getFullYear() === y && date.getMonth() === m - 1) {
        return date;   
      }
    }
  
    return null;
}
function checkDate(pText) {
    let isValid = false ;
    let t = pText.match(/^(\d{2})\/(\d{2})\/(\d{4})$/);

    if (t !== null) {
        let d = +t[1], m = +t[2], y = +t[3];
        let date = new Date(y, m - 1, d);

        isValid = (date.getFullYear() === y && date.getMonth() === m - 1) ;
    }
    return isValid ;
}
function checkTime(time){
    let regex = /^([0-1][0-9]|2[0-3]):([0-5][0-9])$/
    return regex.test(time)
}
function checkEmail(email) {
    let regex = /^[A-Za-z0-9_.]+[@][A-Za-z0-9.-]+[.][A-za-z0-9]+$/
    return regex.test(email)
}

//array of colors
let array=["red","voilet","blue","green"];

//arrow function with slice method:
const nthElement = (arr: string | any[], n = 1) => (n > 0 ? arr.slice(n-1, n ) : arr.slice(n-1))[0];
console.log(nthElement(array, 3));
let [, ,color, ]=array;
console.log(color);

const org={
    name:"snehal",
    address:
    {
        city:"kolhapur",
        pincode:416121
    }
}
if(org.address.pincode===416121)
console.log(org.address.pincode)



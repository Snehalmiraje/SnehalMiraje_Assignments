//Question 4
var names=["snehal","sachin","aavi"];
var output=[];
for(let n of names){
    output.push("{"+n+": "+n.length +"}");
}
console.log(output);

//Question 5
//a
function add(a=5,b=8){
    return (a+b);
}

console.log("Addtion with default values:",add());

//b
let userfriends= function(username: string , ...frdlist: string[]){

    console.log("names of user is : ",username);
    console.log("Frds os user are/is: ");
    
    for(let f of frdlist){
        console.log(f);
    }
}
let username="snehal";
let username2="sachin";
userfriends(username,'s');
userfriends(username2,'s','b','c');


let printCapitalName=function(msg: string , ...usernames: string[]){

    console.log(msg);
    for(let n of usernames){
        console.log(n.toUpperCase());
        
    }
    

}
 let usernames=["snehal","sachin","aavi","ravina"];
 let msg="Names in capital"
printCapitalName(msg,...usernames);
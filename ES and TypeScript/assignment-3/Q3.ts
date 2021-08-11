interface Printable{
 printMessage():any;

}

let circle:Printable={
    printMessage(){
        console.log("This is Circle");
        
    }

}

let employee:Printable={
    printMessage(){
        console.log("This is employee");
        
    }
}

function printAll(...args: Printable[]){
    for(let a of args)
    a.printMessage();

}
printAll(circle,employee);
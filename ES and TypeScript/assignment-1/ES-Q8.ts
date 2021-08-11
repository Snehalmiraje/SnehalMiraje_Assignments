class Account{
   
    id: number;
    ACCname: String;
    balance: any;
    static totalAccB: number=0;
    constructor(id: number,Accname: String,balance: any){
        this.id=id;
        this.ACCname=Accname;
        this.balance=balance;   
    }
    getbalance(){
        return this.balance;
    }
   
    
}

class savingsAcc extends Account{
    interest:any;
    constructor(id:number,accname:String,balance:any,cash: number){
        super(id,accname,balance);
        this.interest=cash;
        Account.totalAccB=Account.totalAccB+balance+cash; 
    }
    total(){
        return this.getbalance()+this.interest;
    }
    

}
class currentAcc extends Account{
    
    cashcredit:any;
    constructor(id:number,accname:String,balance:any,cash: number){
        super(id,accname,balance);
        this.cashcredit=cash;
        Account.totalAccB=Account.totalAccB+balance+cash; 
    }
    total(){
        return this.getbalance()+this.cashcredit;
    }
    
}


let s= new savingsAcc(1,"s",1000,100);
let c= new currentAcc(2,"c",2000,200);
let s1= new savingsAcc(3,"s1",3000,300);
let c1= new currentAcc(4,"c1",4000,400);
console.log("Total balance in savings account"+s.total());
console.log("Total balance in current account"+c.total());
console.log("Total balance in bank "+Account.totalAccB);



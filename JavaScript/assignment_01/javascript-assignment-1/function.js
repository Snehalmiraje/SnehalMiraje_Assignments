function
myFunction(){
document.getElementById("newform").reset();
}
function enableshowSummery(){
    document.getElementById("button1").disabled = false;
}
function show(){
    var name=document.getElementById("name");
   
    var email=document.getElementById("email");
   
        
   
     
    var gender = document.getElementById("s1");
    var gender1 = document.getElementById("s2");
   
    var tip=document.getElementById("tip");
    var add=document.getElementById("add");

    document.getElementById("data").innerHTML=name.value;
    document.getElementById("d2").innerHTML=email.value;
    var markedCheckbox = document.getElementsByName('pl'); 
    var c=0; 
    for (var checkbox of markedCheckbox) {  
        if (checkbox.checked)  
          var txt=checkbox.value + ' ';  
          c++;
    
         }  
   document.getElementById("d3").innerHTML=txt;
   var op="";
    if(gender.checked)
   {    op=gender.value;
       document.getElementById("d4").innerHTML=gender.value;
    }
    else
    {document.getElementById("d4").innerHTML=gender1.value;}

    document.getElementById("d5").innerHTML=tip.value;
    document.getElementById("d6").innerHTML=add.value;
    var d=0;
    if(op==="pickup") d=0;
    else d=5;
    var total=(10+(1.5*c)+d)*1+tip.value;
    document.getElementById("d7").innerHTML=total;
}
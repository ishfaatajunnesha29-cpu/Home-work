

let statuss=new Promise((resolve,reject)=>{setTimeout(() => 
{   
    let success=true;
    if(success)
    {
        console.log("Success");
    }
    else
    {
        console.log("Fail");
    }
}, 2000);
});;

statuss.then(success).catch(failure);

function success(auc)
{
    console.log(suc);
}
function failure(fail)
{
    console.log(fail);
}


//************//


function checkNumber(resolve,reject) 
{
    let num=6;
    if (num % 2 === 0) 
    {
        console.log("Even → Success");
    } 
    else 
    {
        console.log("Odd → Fail");
    }

}

let res =new Promise(checkNumber);

res.then(EvenNum).catch(OddNum);

function EvenNum(even)
{
    console.log(even);
}
function OddNum(odd)
{
    console.log(odd);
}

//**********//



function checkMark(resolve,reject) 
{
    let mark=45;
    if (mark>=50) 
    {
        console.log("Pass");
    } 
    else 
    {
        console.log("Fail");
    }

}

let result =new Promise(checkMark);

res.then(Pass).catch(Fail);

function Pass(yes)
{
    console.log(yes);
}
function Fail(no)
{
    console.log(no);
}

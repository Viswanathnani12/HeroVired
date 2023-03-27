que = [
    {
        question:"What is the Full-Form of FSD?",
        Options:['Full Stall Devolopment','Full Stick Devolopment','Full Stack Devolopment','Full Stamp Devolopment'],
        ans:1
    },
    {
        question:"What is the Full-Form of LBW?",
        Options:['Leg Before Wicket','Leg But Wicket','Leg Begin Wicket','Leg Bother Wicket'],
        ans:0
    },
    {
        question:"What is the Full-Form of IPL?",
        Options:['Indian Premier Land','Indonesia Premier Land','Indian Punjab Loan','Indian Premier League'],
        ans:3
    },
    {
        question:"What is the Full-Form of RCB?",
        Options:['Royal Challengers Banglore','Royal Challenger Banglore','Royal Chassers Banglore','Real Challengers Banglore'],
        ans:0
    },
    {
        question:"What is the Full-Form of HTML?",
        Options:['Hyper Text Make Language','Height Text Make Language','Hyper Text Markup Language','Hyper Text Mock Language'],
        ans:2
    }
]

let question = document.querySelector('.que');
let button = document.querySelector('#btn');
let opt = document.querySelector('.op');
let user = '';
let ansc = 0;
let ind = 0;

button.addEventListener('click',()=>
{
    if(user === que[ind].ans)
        ansc+=1;
    ind++;
    user = "";
    question.innerHTML = '';
    opt.innerHTML = '';
    next();
})

let next = ()=>
{
    if(ind == 5)
    {
        question.innerHTML ="<p> Total Score: "+ansc+"</p>";
        document.querySelector('#qbox').innerHTML = '<p>Result: '+ansc+'</p><br><button onclick="window.location.reload()" id="btn">Restart</button>';
        return "";
    }    
    question.innerHTML ="<p>"+que[ind].question+"</p>" ;
    que[ind].Options.forEach((e,i)=>
    {
        opt.innerHTML+="<div class='o'> <input type='radio' name='opt' id='opt"+i+"'/><label for='opt"+i+"'>  "+e+"</label><br/></div> ";
    })
    let ans = document.querySelectorAll('.o')
    ans.forEach((e,i)=>
    {
        e.addEventListener('click',() => 
        {
            user = i;
        })
    })
}
next();

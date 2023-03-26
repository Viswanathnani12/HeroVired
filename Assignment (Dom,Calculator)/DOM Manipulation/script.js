let p = document.querySelector('#pid');
let btn = document.querySelector('#btn')
let inp = document.querySelector('#input');
let lis = document.querySelectorAll('.li');
let lia = Array.from(lis);
p.addEventListener('mouseover',(e)=>{
     console.log(e.target.style)
     p.style.color='red'
     p.style.cursor='pointer'
})
p.addEventListener('mouseout',(e)=>{
    console.log(e.target.style)
    p.style.color='black'
})
btn.addEventListener('mouseover',()=>{
    btn.innerHTML='Button After Hovered';
})
btn.addEventListener('mouseout',()=>{
    btn.innerHTML='Text Inside Button';
})
btn.addEventListener('click',()=>{
    p.innerText = inp.value;
})
lia.forEach((li)=>{
    li.addEventListener('mouseover',()=>{
         li.style.color = "blue";
         li.style.fontSize='20px';
    })
})
lia.forEach((li)=>{
    li.addEventListener('mouseout',()=>{
         li.style.color = "black";
         li.style.fontSize= 'medium';
    })
})
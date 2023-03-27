let val=document.getElementsByClassName('dis')[0];
function f1(e){
    val.innerHTML+=e;
}
function ans()
{
    val.innerHTML=eval(val.innerHTML);
}
function clearone(){
    val.innerHTML=val.innerHTML.substring(0, val.innerHTML.length - 1);
}
function clearall()
{
    val.innerHTML="";
}
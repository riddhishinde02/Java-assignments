
var counter=1;

function addElementsDiv(){
	var d=document.getElementById("myContents");

    var mydiv=document.createElement("div");
    mydiv.id=counter;

    var i=document.createElement("input");
    i.name='username';
    i.type='text';
    i.value=counter;
    i.placeholder='Enter username';

    var b=document.createElement("button");
    b.name="button";
    b.value="Demo button ";
    b.innerText="Demo Button " +counter;
    b.style.margin="3px";

    var r=document.createElement("button");
    r.name="button";
    r.value="Remove  ";
    r.innerText="Remove " +counter;
    r.style.margin="9px";


    b.addEventListener("click",function(){
    alert("Welcome")
});
d.appendChild(mydiv);
d.appendChild(i);
d.appendChild(b);
d.appendChild(r);
counter=counter+1;


r.addEventListener("click",function(){
    d.removeChild(mydiv);
    d.removeChild(i);
    d.removeChild(b);
    d.removeChild(r);
});

}


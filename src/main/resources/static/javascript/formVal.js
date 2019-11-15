

    // document.getElementById("submit").addEventListener("click",function(event){
    //     event.preventDefault()});
            
//     document.getElementById("submit").addEventListener("click",formValidation(event));

function formValidation(){
      if(document.getElementById("firstName").value.length==0
        || document.getElementById("lastName").value.length==0
        || document.getElementById("username").value.length==0
        || document.getElementById("email").value.length==0){
            
       alert("All fields not complete"); 
       return false;
    }
    return true;
}

function fieldValidation(id){
    if(document.getElementById(id).value.length==0){
        document.getElementById(id).className ="error";
    }
    if(document.getElementById(id).value.length!=0){
        document.getElementById(id).className ="inputFields";
    }

}
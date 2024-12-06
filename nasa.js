
//alert("R2");
$(document).ready(function() {
    alert("R1");

    $.ajax({
        url: "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY",
        type:"GET",
        success:function(data){
            //alert(data.hdurl);
            $('#nasaimg').append(`<h1>${data.title}</h1><br>`);
            $('#nasaimg').append(`<p>${data.explanation}</p><br>`);
            $('#nasaimg').append(`<br><img src=${data.hdurl}>`);
            console.log(data);
        },
        error:function(err){
            //alert(err);
            console.log(err);
        }        
    })
});



$().ready(function(){
  console.log("ready");
  showlocations();
})

function showlocations(){
  $.ajax({
    type : "GET",
    url : "/showlocations",
    success : function(data){
      var result ;
      result = "<select class = 'form-control' id = 'sel'>";
      result += "<option val = '0'>select location</option>";
      var temp;

      for (var i = 0; i < data.length; i++) {
        temp = data[i].locationName+","+data[i].latitude.toString()+","+data[i].longitude;
        result += "<option value = '"+temp+"'>"+data[i].locationName+"</option>";
      }

      result += "</select>";
      document.getElementById("location").innerHTML = result;


      // $("#sel").change(function(){
      //   var location = $(this).val();
      //   checkin(location);
      // });
    },

    dataType : 'json',
    contentType: 'application/json'
  });
}


function checkin(){

  var location =  $("#sel").val();

  // $("#sel").change(function(){
  //   var location = $(this).val();
  //   checkin(location);
  // });

  console.log("checkin");
  console.log(location);
  var array = location.split(',');
  var locationName = array[0];
  var latitude = parseFloat(array[1]);
  var longitude = parseFloat(array[2]);
  var caption = document.getElementById("caption").value;

  console.log(locationName);
  console.log(latitude);
  console.log(longitude);
  console.log(caption);

  $.ajax({
    type : "POST",
    url : "/user/1/checkin",
    data : JSON.stringify({
      "locationName" : locationName,
      "latitude" : latitude,
      "longitude" : longitude,
      "caption" : caption
    }),
    success : render,
    dataType : 'json',
		contentType: 'application/json'
  });
}

function render(){
  alert("Checkin success")
  console.log("Success");
}

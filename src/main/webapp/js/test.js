$("#infoBtn").click(function() {
	
	getAllthePeople();

});

function getAllthePeople(){
	$.ajax({
		  type: 'GET',
		  url: 'rest/person/',
		  success: handleResponseJQuery,
		  contentType: 'application/json'
	});
	
}

function handleResponseJQuery(myData) {
	
	for(var i = 0 ; i <myData.length; i++){
	
		 $('#table-body').append(
                 "<tr>" +
                 "<td>" + myData[i].id + "</td>" +
                 "<td>" + myData[i].name + "</td>" +
                 "<td>" + myData[i].age + "</td>" +
                 "</tr>");
             };
		
}


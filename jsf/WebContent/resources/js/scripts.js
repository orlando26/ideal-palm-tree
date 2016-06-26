var rideInterval;

$(function(){
    $('.boton_numero').click(function(){
        var text = $('#login-form\\:username').val();
        $('#login-form\\:username').val(text + $(this).text());
    });
    
    $('#login-form\\:boton_borrar').click(function(){
        $('#login-form\\:username').val('');
    });
});

function startInterval() {
	btn = document.getElementById("rideForm:ride_listener_btn");
	rideInterval = setInterval(function() {btn.click()}, 5000);
}

function stopInterval() {
	if (rideInterval !== undefined)
		clearInterval(rideInterval);
}
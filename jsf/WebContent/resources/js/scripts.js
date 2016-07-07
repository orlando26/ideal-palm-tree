var rideInterval;

$(function(){
	//Boton registro
	$('.botoncirculo').click(function(){
		$(this).parent().find($('.circulo')).animate({
			width: '15vw',
			left: '0%',
			top: '0%'
		}, 150, function() {
			$(this).parent().find($('.circulo')).animate({
				width: '0vw',

			}, 10, function() {
				$('.botoncirculo').animate({
					left: '110vw',
					opacity: '0'
				}, 500)
			}) ;	
		});
		setTimeout(function(){
			$('#LinkRegister')[0].click();
		}, 500);
	});
	
	//Boton cerrar barra lateral
	
	//fin de botones admin

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

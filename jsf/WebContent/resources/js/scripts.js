var rideInterval;

$(function(){
	//Boton registro
	$('.botoncirculo').click(function(){
		var elemId = $(this).attr('id');
		elemId = elemId.substring(11, elemId.length);
		console.log(elemId);
		$(this).parent().find($('.circulo')).animate({
			height: '24.49122vh',
			left: '0%',
			top: '0%'
		}, 150, function() {
			$(this).parent().find($('.circulo')).animate({
				height: '0vh',
				left: '50%',
				top: '50%'
			}, 10, function() {
				$('.botoncirculo').animate({
					right: '-50vw',
					opacity: '0'
				}, 500)
			}) ;	
		});
		setTimeout(function(){
			if (elemId == "btn_reg"){
				$('#LinkRegister')[0].click();
			} else if (elemId == "btn_ver"){
				$('#LinkSearch')[0].click();
			} else if (elemId == "btn_rut"){
				$('#LinkRoute')[0].click();
			}
			
		}, 500);
	});
	//Boton cerrar barra lateral
	$('.cerrar').click(function(){
		$('.botoncirculo').animate({
			right: '0vw',
			opacity: '1'
		}, 500)
	}) ;	
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

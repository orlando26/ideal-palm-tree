var rideInterval;

$(function(){
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
        		}, 500, function(){
        		$('.botoncirculo').animate({
        			left: '-110vw'
        		},0)	
        		})
        	}) ;	
        });
      });
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

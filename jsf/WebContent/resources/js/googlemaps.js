var map;

function initMap() {
	console.log("Map called");
    map = new google.maps.Map(document.getElementById('map'), {
      center: {lat: -34.397, lng: 150.644},
      zoom: 8,
      disableDefaultUI: true
    });
}

function finishRide() {
    console.log("Imagen picada");
	btn = document.getElementById('mapForm:finish_ride_btn');
    btn.click();
}

document.addEventListener("DOMContentLoaded", function () {
    var obterLocalizacaoButton = document.getElementById("obterLocalizacaoButton");
    obterLocalizacaoButton.addEventListener("click", function () {
        if ("geolocation" in navigator) {
            navigator.geolocation.getCurrentPosition(function (position) {
                var latitude = position.coords.latitude;
                var longitude = position.coords.longitude;
                var resultado = document.getElementById("resultado");
                resultado.innerHTML = "Latitude: " + latitude + "<br>Longitude: " + longitude;

                // Criar um mapa e definir a localização
                var mapa = new google.maps.Map(document.getElementById("mapa"), {
                    center: { lat: latitude, lng: longitude },
                    zoom: 15 // Nível de zoom (ajuste conforme necessário)
                });

                // Adicionar um marcador para a localização
                var marcador = new google.maps.Marker({
                    position: { lat: latitude, lng: longitude },
                    map: mapa,
                    title: "Sua localização"
                });
            });
        } else {
            var resultado = document.getElementById("resultado");
            resultado.innerHTML = "Geolocalização não suportada pelo seu navegador.";
        }
    });
});

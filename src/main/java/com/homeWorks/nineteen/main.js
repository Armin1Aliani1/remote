$(document).ready(function () {
    document.getElementById("btn").onclick = function () {
        geo()
    };
    var state;

    function geo() {
        var stateName = document.getElementById("states").value;
        $.ajax({
            type: "GET",
            url: "http://api.openweathermap.org/geo/1.0/direct?q=" + stateName + "&limit=1&appid=c0e42332729c344a89b55f4fd7fe1c86",
            async: false,
            success: function (response) {
                console.log(response[0].name);
                console.log(response[0].lat);
                console.log(response[0].lon);

                $.ajax({
                    type: "GET",
                    url: "https://api.openweathermap.org/data/2.5/weather?lat=" + response[0].lat + "&lon=" + response[0].lon + "&appid=c0e42332729c344a89b55f4fd7fe1c86",
                    success: function (response) {
                        console.log(response);

                        var tdHtml;
                        tdHtml = tdHtml + `<tr>
                            <td>${response.weather[0].id}</td>
                            <td>${response.weather[0].main}</td>
                            <td>${response.weather[0].description}</td>
                            <td>${response.wind.speed}</td>
                            <td>${response.wind.deg}</td>
                            <td>${response.cod}</td>
                            <td>${response.name}</td>
                        </tr>`

                        $("#tableBody").html(
                            tdHtml
                        );
                    }
                });
            }
        });
    }
});
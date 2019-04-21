<html>
<head>
    <title>Calculadora</title>
    <style>
        input {
            display: block;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script>
        function somar() {

            var numero1 = $("#numero1").val();
            var numero2 = $("#numero2").val();

            $.ajax({
                url: "/calculadora/somar",
                method: "POST",
                data: {
                    "numero1": numero1,
                    "numero2": numero2
                },
                success: function (resposta) {
                    alert("A soma e " + resposta);
                    limparCampos();
                },
                error: function () {
                    alert("nao funcionou");
                    limparCampos();
                }
            });
        }

        function limparCampos() {
            $("#numero1").val("");
            $("#numero2").val("")
        }
    </script>
</head>
<body>
<div>
    <label for="numero1">Informe primeiro numero:</label>
    <input id="numero1" type="number" name="numero1" required/>
    <label for="numero2">Informe segundo numero:</label>
    <input id="numero2" type="number" name="numero2" required/>
    <a href="#" onclick="somar()">Somar</a>
</div>
</body>
</html>

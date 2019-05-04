<html>
<head>
    <title>Calculadora</title>
    <style>
        input {
            display: block;
        }

        .box {
            width: 200px;
            height: 100px;
            display: inline-block;
            border: 1px solid black;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script>
        function processa(operacao) {

            var numero1 = "";
            var numero2 = "";

            if (operacao === "somar") {
                numero1 = $("#numero_soma1").val();
                numero2 = $("#numero_soma2").val();
            } else if (operacao === "subtrair") {
                numero1 = $("#numero_subtrair1").val();
                numero2 = $("#numero_subtrair2").val();
            }


            $.ajax({
                url: "/calculadora/" + operacao,
                method: "POST",
                data: {
                    "numero1": numero1,
                    "numero2": numero2
                },
                success: function (resposta) {
                    alert("Operacao: " + operacao + "\nresultado: " + resposta);
                    limparCampos();
                },
                error: function (erro) {
                    alert("Erro. Mensagem: " + erro);
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
<div class="box">
    <label for="numero_soma1">Informe primeiro numero:</label>
    <input id="numero_soma1" type="number" name="numero1" required/>
    <label for="numero_soma2">Informe segundo numero:</label>
    <input id="numero_soma2" type="number" class="numero2" name="numero2" required/>
    <a href="#" onclick="processa('somar')">Somar</a>
</div>
<div class="box">
    <label for="numero_subtrair1">Informe primeiro numero:</label>
    <input id="numero_subtrair1" type="number" name="numero1" required/>
    <label for="numero_subtrair2">Informe segundo numero:</label>
    <input id="numero_subtrair2" type="number" name="numero2" required/>
    <a href="#" onclick="processa('subtrair')">Subtrair</a>
</div>
</body>
</html>

document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastroEnderecoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const numero = document.getElementById("numero").value;
		const rua = document.getElementById("rua").value;
		const bairro = document.getElementById("bairro").value;
		const complemento = document.getElementById("complemento").value;
		const cidade = document.getElementById("cidade").value;
		const cep = document.getElementById("cep").value;
		const estado = document.getElementById("estado").value;

		try {

			const response = await fetch("http://localhost:8080/cadastroendereco", {
				method: "POST",
				headers: {
					"Content-type": "application/json"
				},
				body: JSON.stringify({
					numero,
					rua,
					bairro,
					complemento,
					cidade,
					cep,
					estado
				}),
			});

			if (response.ok) {
				alert("Endereco cadastrado com sucesso!");
			} else {
				alert("Erro ao cadastrar o cliente");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o cliente:", error)
		}
	})
})
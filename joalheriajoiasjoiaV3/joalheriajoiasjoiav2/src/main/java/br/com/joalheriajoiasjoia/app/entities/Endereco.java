package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente_endereco")
public class Endereco {
	
		// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idEndereco", nullable = false)
		private Long idEndereco;
		
		@Column(name = "Cep", nullable = false)
		private String cep;
		
		@Column(name = "Rua", nullable = false, length = 100)
		private String rua;
		
		@Column(name = "Numero", nullable = false, length = 11, unique = true)
		private String numero;
		
		@Column(name = "Cidade", nullable = false, unique = false, length = 50)
		private String cidade;
		
		@Column(name = "Estado", nullable = false,  unique = false, length = 11)
		private String estado;
		
		@Column(name = "Complemento", nullable = false,  unique = false)
		private String complemento;
		
		@Column(name = "Bairro", nullable = false,  unique = false)
		private String bairro;



		// Construtores
		public Endereco() {

		}
		
		public Endereco(String cep, String rua, String numero, String cidade, String estado, String complemento, String bairro) {
			this.cep = cep;
			this.rua = rua;
			this.numero = numero;
			this.cidade = cidade;
			this.estado = estado;
			this.complemento = complemento;
		}
		
		// Getters And Setters

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		
	}




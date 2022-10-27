package lutasemojis;

public class Lutador {
	
	// Atributos
	private String nome, nacionalidade,categoria ;
	private double altura, peso;
	private int idade, vitorias, derrotas, empates;
	
	
	// Método Construtor
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na; 
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	// Métodos publicos
	public void apresentar() {
		String[] lutador = {"Nome do lutador: " + nome, 
							"Natural de: " + nacionalidade, 
							"Idade: " + idade,
							"Altura: " + altura,
							"Peso: " + peso,
							"Vitorias: " + vitorias,
							"Derrotas: " + derrotas,
							"Empates: " + empates
							};
		
		for (String i : lutador) {
			System.out.println(i);
		};
	}
	
	public void status() {
		String[] statusLutador = {"Nome: " + getNome(),						
								  "Categoria: " + getCategoria(),
								  "Vitorias: " + String.valueOf(getVitorias()),
								  "Derrotas: " + String.valueOf(getDerrotas()),
								  "Empates: " + String.valueOf(getEmpates())
								  };
		for (String status : statusLutador) {
			System.out.println(status);
		}
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
	// Métodos Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		
		if (this.peso < 52.2) {
			this.categoria = "Invalido"; 		
		}else if(this.peso <= 70.3) {
			this.categoria = "Leve"; 
		}else if(this.peso <= 83.9) {
			this.categoria = "Medio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
	
	
	
	
	
	
}
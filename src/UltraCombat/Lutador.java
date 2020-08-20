package UltraCombat;

public class Lutador {
	//ATRIBUTOS--------------------------
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	
	//METODOS PUBLICOS--------------------
	public void aprensentar() {
		System.out.println( " ----------------------------------------------------------");
		System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR " + this.getNome());
		System.out.println("Diretamente de  " + this.getNacionalidade());
		System.out.println("Com  " + this.getIdade() + " anos e "+ this.getAltura());
		System.out.println("Pesando  " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " vit�rias");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates!");
		System.out.println( " ----------------------------------------------------------");
		
	}
	
	public void status() {
		System.out.println( " ----------------------------------------------------------");
		System.out.println(this.getNome() +  " � um peso " + this.getCategoria());
		System.out.println(" Ganhou  " + this.getVitorias() + " Vezes");
		System.out.println(" Perdeu  " + this.getDerrotas() + " Vezes");
		System.out.println(" Empatou  " + this.getEmpates() + " Vezes");
		System.out.println(" ------------------------------------------------------------");
		
		
		
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
	
	//METODOS ESPECIAIS-------------------

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, 
			int vitorias, int derrotas,int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	

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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
//-------------------------------------------
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	//--------------------------------------
	private String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "INVALIDO";
		}else if(this.peso < 70.3) {
			this.categoria = "LEVE";
		}else if(this.peso < 83.9) {
			this.categoria = "MEDIO";
		}else if(this.peso < 120.2) {
			this.categoria = "PESADO";
		}else {
			this.categoria = "INVALIDO";
		}
		
	}
	//-----------------------------------

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	//------------------------------

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	//--------------------------------
	
	
	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	

	
	
	
	
	
	
}

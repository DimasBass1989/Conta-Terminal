
public class Dados {
	
	private String nome;
	private Integer agencia;
	private Integer numecoConta;
	private double saldo;
	
	public Dados(String nome, Integer agencia, Integer numecoConta, double saldo) {
		super();
		this.nome = nome;
		this.agencia = agencia;
		this.numecoConta = numecoConta;
		this.saldo = saldo;
	}
	public Dados() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumecoConta() {
		return numecoConta;
	}

	public void setNumecoConta(Integer numecoConta) {
		this.numecoConta = numecoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", agencia=" + agencia + ", numecoConta=" + numecoConta + ", saldo=" + saldo
				+ "]";
	}
	
	
	
	
	

}

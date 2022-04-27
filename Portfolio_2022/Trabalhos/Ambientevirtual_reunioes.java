 ##Dev:Félix Francisco
//Matéria modelagem de dados
// A minha escolha foi por conta do tema que preferi fazer ser mais dinamico onde fiz o diagrama e o código do diagrama
// Diagrama - https://app.diagrams.net/#G1XoVc2ZbH-6tWbmQLgqsUX4iZRS-HKX-V 
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
// classe AmbienteVirtual
public class AmbienteVirtual{
  private String nome;
  private boolean autorizar;
  private Fornecedor fornecedor;
  private Lojista lojista;

public AmbienteVirtual(String nome,boolean autorizar){
this.nome=nome;
this.autorizar=autorizar;	
	
}
}
// classe demanda
public class Demanda{
  private Orcamento orcamento;
  

public Demanda(Orcamento orcamento){
  this.orcamento=orcamento;
}
	public Orcamento renegociar(Orcamento orcamento){
orcamento.faturamento=orcamento.faturamento*0.9;
	}
	
public void Discutir(){}
	public void ChegarAcordo(){}
	
}
//classe Fornecedor
public class Fornecedor{
   private String nome,cnpj;
  private Orcamento orcamento;

public Fornecedor(String nome,String cnpj, Orcamento orcamento){
  this.nome=nome;
  this.cnpj=cnpj;
  this.orcamento= orcamento;
}
public void Comprar(){
  }
public void fazOrcamento(){
  }
public void pagaBoletos(){
  }
public void conquistaCliente(){
  }  
}
// classe lojista
public class Lojista{
  private String nome,cnpj;
  private Demanda demanda;


  public Lojista(String nome,String cnpj, Demanda demanda){
    this.nome=nome;
    this.cnpj=cnpj;
    this.demanda=demanda;
  }
  public void compra(){
    
  }
  public void vende(){
    
  }
  public void recebe(){
    
  }
  public void paga(){
    
  }
}
  // classe orcamento
  public class Orcamento{
  public int faturamento,valor_min,valor_servico;
  private String produtos;

public Orcamento(String produtos, int faturamento, int valor_min, int valor_servico){
  this.produtos= produtos;
  this.faturamento= faturamento;
  this.valor_min = valor_min; 
  this.valor_servico = valor_servico; 
  }
public void armazenaSerivico(){}
public void armazenaProduto(){}
public void armazenaFaturamento(){}
}
//classe reuniao
public class Reuniao{
  private String ata,data,proposta_negocios;
  private boolean autorizacao;
  private Fornecedor fornecedor;
  private Lojista lojista;

public Reuniao(String ata,String data,String proposta_negocios,boolean autorizacao){

this.ata=ata;
	this.data=data;
	this.proposta_negocios=proposta_negocios;
	this.autorizacao=autorizacao;

		 
		 }
	public void Inicia(){
		
	}
	public void possuiAta()
	{
		
	}
	public void realizaPropostas(){
		
	}
	public void finaliza(){
		
	}
	
	
	
}

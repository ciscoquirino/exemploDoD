package com.digsol.tecsuscrud.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//a classe representa uma tabela no banco de dados
@Entity
public class ContaAgua {
	//cada variavel será um campo da tabela
	//as 2 etiquetas geram o id primary key e auto increment
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String concessionaria;
	private String concess_end;
	private String concess_cnpj;
	
	private String fornecimento;
	private LocalDate emissao;
	
	private String tipo_fornecimento;
	private String cliente_nome;
	private String cliente_cep;
	private String cliente_end;
	private String cod_cliente;
	private String pde_rgi;
	private String hidrometro;
	private String insc_estadual;
	private String lacre;
	
	private String economias;
	private String tipo_ligacao;
	private float consumo_m3;
	private int periodo_consumo;
	private float media_consumo;
	
	private float total_agua;
	private float total_esgoto;
	private float multa;
	private float at_monet;
	private float juros_mora;
	private float taxa_regulacao;
	
	private float valor_total;
	private LocalDate vencimento;
	private float valor_tributos;
	
	//metodo construtor
	public ContaAgua() {
	}
	
	//generate getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConcessionaria() {
		return concessionaria;
	}

	public void setConcessionaria(String concessionaria) {
		this.concessionaria = concessionaria;
	}

	public String getConcess_end() {
		return concess_end;
	}

	public void setConcess_end(String concess_end) {
		this.concess_end = concess_end;
	}

	public String getConcess_cnpj() {
		return concess_cnpj;
	}

	public void setConcess_cnpj(String concess_cnpj) {
		this.concess_cnpj = concess_cnpj;
	}

	public String getFornecimento() {
		return fornecimento;
	}

	public void setFornecimento(String fornecimento) {
		this.fornecimento = fornecimento;
	}

	public LocalDate getEmissao() {
		return emissao;
	}

	public void setEmissao(LocalDate emissao) {
		this.emissao = emissao;
	}

	public String getTipo_fornecimento() {
		return tipo_fornecimento;
	}

	public void setTipo_fornecimento(String tipo_fornecimento) {
		this.tipo_fornecimento = tipo_fornecimento;
	}

	public String getCliente_nome() {
		return cliente_nome;
	}

	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}

	public String getCliente_cep() {
		return cliente_cep;
	}

	public void setCliente_cep(String cliente_cep) {
		this.cliente_cep = cliente_cep;
	}

	public String getCliente_end() {
		return cliente_end;
	}

	public void setCliente_end(String cliente_end) {
		this.cliente_end = cliente_end;
	}

	public String getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getPde_rgi() {
		return pde_rgi;
	}

	public void setPde_rgi(String pde_rgi) {
		this.pde_rgi = pde_rgi;
	}

	public String getHidrometro() {
		return hidrometro;
	}

	public void setHidrometro(String hidrometro) {
		this.hidrometro = hidrometro;
	}

	public String getInsc_estadual() {
		return insc_estadual;
	}

	public void setInsc_estadual(String insc_estadual) {
		this.insc_estadual = insc_estadual;
	}

	public String getLacre() {
		return lacre;
	}

	public void setLacre(String lacre) {
		this.lacre = lacre;
	}

	public String getEconomias() {
		return economias;
	}

	public void setEconomias(String economias) {
		this.economias = economias;
	}

	public String getTipo_ligacao() {
		return tipo_ligacao;
	}

	public void setTipo_ligacao(String tipo_ligacao) {
		this.tipo_ligacao = tipo_ligacao;
	}

	public float getConsumo_m3() {
		return consumo_m3;
	}

	public void setConsumo_m3(float consumo_m3) {
		this.consumo_m3 = consumo_m3;
	}

	public int getPeriodo_consumo() {
		return periodo_consumo;
	}

	public void setPeriodo_consumo(int periodo_consumo) {
		this.periodo_consumo = periodo_consumo;
	}

	public float getMedia_consumo() {
		return media_consumo;
	}

	public void setMedia_consumo(float media_consumo) {
		this.media_consumo = media_consumo;
	}

	public float getTotal_agua() {
		return total_agua;
	}

	public void setTotal_agua(float total_agua) {
		this.total_agua = total_agua;
	}

	public float getTotal_esgoto() {
		return total_esgoto;
	}

	public void setTotal_esgoto(float total_esgoto) {
		this.total_esgoto = total_esgoto;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}

	public float getAt_monet() {
		return at_monet;
	}

	public void setAt_monet(float at_monet) {
		this.at_monet = at_monet;
	}

	public float getJuros_mora() {
		return juros_mora;
	}

	public void setJuros_mora(float juros_mora) {
		this.juros_mora = juros_mora;
	}

	public float getTaxa_regulacao() {
		return taxa_regulacao;
	}

	public void setTaxa_regulacao(float taxa_regulacao) {
		this.taxa_regulacao = taxa_regulacao;
	}

	public float getValor_total() {
		return valor_total;
	}

	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public float getValor_tributos() {
		return valor_tributos;
	}

	public void setValor_tributos(float valor_tributos) {
		this.valor_tributos = valor_tributos;
	}
	
	
	
	
}

package br.com.classes;

import br.com.conexao.Conexao;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Venda", unique = true, nullable = false)
    private Integer idvenda;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE})
    private Usuario usuario;
    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private List<FormaPagamento> formaPagamento;
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private List<Parcelas> parcelas;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ItensVenda> itens;

    private int codigoVenda;
    private Date dataVenda;
    private boolean status;
    private double valor_pago;
    private double valorTotal;
    private Date prazo;
    private String descricao;
    private String Pago;

    private double troco;
    public Venda() {

    }

    public Venda(Integer idvenda, Cliente cliente, Usuario usuario, List<FormaPagamento> formaPagamento, List<Parcelas> parcelas, List<ItensVenda> itens, int codigoVenda, Date dataVenda, boolean status, double valor_pago, double valorTotal, Date prazo, String descricao, String Pago, double troco) {
        this.idvenda = idvenda;
        this.cliente = cliente;
        this.usuario = usuario;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.itens = itens;
        this.codigoVenda = codigoVenda;
        this.dataVenda = dataVenda;
        this.status = status;
        this.valor_pago = valor_pago;
        this.valorTotal = valorTotal;
        this.prazo = prazo;
        this.descricao = descricao;
        this.Pago = Pago;
        this.troco = troco;
    }

    

    public Integer getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(List<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcelas> parcelas) {
        this.parcelas = parcelas;
    }

    public List<ItensVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItensVenda> itens) {
        this.itens = itens;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }
    
//--------------------------------------------------------------

    public ItensVenda itensvenda() {
        for (ItensVenda iten : itens) {
            return iten;
        }
        return null;
    }

    public String FormaPagamento() {
        for (FormaPagamento formaPagamento1 : formaPagamento) {
            return formaPagamento1.getDescricao();
        }
        return null;
    }

    public void adicionarItens(List<Produto> lista, Venda venda) {
        Conexao bancoDAO = new Conexao();

        for (Produto produto : lista) {
            ItensVenda itensvenda = new ItensVenda();
            itensvenda.setStatus(true);
            itensvenda.setItems(produto);
            itensvenda.setQnt(produto.getQnt());
            itensvenda.setVenda(venda);
            bancoDAO.save(itensvenda);
        }

        for (ItensVenda itensVenda : bancoDAO.list_ItemsVenda()) {
            if (itensVenda.getVenda().getIdvenda().equals(venda.getIdvenda())) {
                venda.getItens().add(itensVenda);// preenche a lista de itens;
            }
        }
        bancoDAO.update(venda); // atualiza a venda depois de adicionar os itens da venda;
    }

    public void gerarParcelas(int numParcela, Venda venda, double valorParcela) {
        int numeroParcela = 1; // impede da primeira parcela ser 0 na tabela do banco;
        Conexao bancoDAO = new Conexao();
        GregorianCalendar gc = new GregorianCalendar();
        Date diaAtual = new Date();
        
        for (int i = 0; i < numParcela; i++) {
            Parcelas parcela = new Parcelas();// FAZ COM QUE REGISTRA UMA NOVA PARCELA NO BANCO;

            gc.setTime(diaAtual);
            gc.roll(GregorianCalendar.MONTH, i+1);
            Date d = gc.getTime();

            venda.getParcelas().add(parcela);// ADICIONA AS PARCELAS
            parcela.setVenda(venda);
            parcela.setValor(valorParcela);
            parcela.setParcela(numeroParcela + i);//  NUMERO DAS PARCELAS;
            parcela.setData(d);
            parcela.setStatus(true);
            bancoDAO.save(parcela); //SALVA A PARCELA NO BANCO DE DADOS;
        }
        // https://www.guj.com.br/t/duvida-gerar-parcelas-com-data-resolvido/134893/2 forum que ajudou a criar as datas da parcela;
    }

}

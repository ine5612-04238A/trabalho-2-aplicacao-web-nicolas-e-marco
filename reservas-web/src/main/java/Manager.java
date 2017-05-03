
import javax.ejb.EJB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 02543592059
 */
public class Manager {
    
    @EJB
    //protected AgendaEJBLocal agenda;

    protected String nome;
    protected String senha;
    protected String email;
    protected String tipoUsuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
 
    public String gravarNovoUsuario() {
      /*  Contato contato = new Contato();
        contato.setNome(this.nome);
        contato.setTelefone(this.telefone);
        contato.setEndereco(this.endereco);
        this.agenda.gravar(contato);
        return "index.xhtml"; */
    return "";
    }
    
}

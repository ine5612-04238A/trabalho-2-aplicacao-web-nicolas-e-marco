package ine5646;

import javax.ejb.EJB;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class Manager implements Serializable{
    
    @EJB
    protected EJBLocal ejb;

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
      if(this.ejb.buscarEmail(this.email)!=null){
        if (!this.ejb.buscarEmail(this.email).getEmail().equals(this.email)){
             if (this.tipoUsuario.equals("Funcionario")) {
                 Funcionario usuario = new Funcionario (this.nome, this.email, this.senha, "Funcionario");
                 this.ejb.gravar(usuario);
             }else {
                 Cliente usuario = new Cliente (this.nome, this.email, this.senha, "Cliente");
                 this.ejb.gravar(usuario);
            }
        return "index.xhtml"; 
        }
        
        else{
            FacesMessage msg = new FacesMessage("Email já cadastrado!");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
            return null;
        }
    }
      else{
         
             if (this.tipoUsuario.equals("Funcionario")) {
                 Funcionario usuario = new Funcionario (this.nome, this.email, this.senha, "Funcionario");
                 this.ejb.gravar(usuario);
             } else {
            Cliente usuario = new Cliente (this.nome, this.email, this.senha, "Cliente");
            this.ejb.gravar(usuario);
        }
        return "index.xhtml"; 
          
      }
 
    }
    
    public String autenticarLogin() {
        if(this.ejb.buscarEmail(this.email)!=null){
            if(this.ejb.buscarEmail(this.email).getSenha().equals(this.senha) && this.ejb.buscarEmail(this.email).getEmail().equals(this.email) ) {
                if(this.ejb.buscarEmail(this.email).getTipoUsuario()=="Funcionario"){
                      return "TelaFuncionario.xhtml";
              }else{
                   return "TelaCliente.xhtml";
              }
        }   
        } 
            FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
            return null;
    }
    
}

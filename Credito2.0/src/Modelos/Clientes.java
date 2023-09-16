package Modelos;
// Generated 11/set/2023 18:45:06 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 * Clientes generated by hbm2java
 */
@Entity
public class Clientes  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_sequence")
    @SequenceGenerator(name = "cliente_id_sequence", sequenceName = "cliente_id_sequence", allocationSize = 1)
    @Column(name = "CLIENTE_ID", precision = 8, scale = 0)
     private int clienteId;
    
    @Column(name = "NOME", length = 50, nullable = false)
     private String nome;
    
    @Column(name = "EMAIL", length = 60, nullable = false)
     private String email;
    
    @Column(name = "SENHA", length = 59, nullable = false)
     private String senha;
    
    @Column(name = "NIVEL_PERM", length = 40, nullable = false)
     private String nivelPerm;
    
    @Column(name = "STATUS", precision = 1, scale = 0, nullable = false)
     private boolean status;
    
    @Column(name = "ADMISSAO", length = 7)
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date admissao;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     private Set pedidoses = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(int clienteId, String nome, String email, String senha, String nivelPerm, boolean status) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelPerm = nivelPerm;
        this.status = status;
    }
    public Clientes(int clienteId, String nome, String email, String senha, String nivelPerm, boolean status, Date admissao, Set pedidoses) {
       this.clienteId = clienteId;
       this.nome = nome;
       this.email = email;
       this.senha = senha;
       this.nivelPerm = nivelPerm;
       this.status = status;
       this.admissao = admissao;
       this.pedidoses = pedidoses;
    }
   
    public int getClienteId() {
        return this.clienteId;
    }
    
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNivelPerm() {
        return this.nivelPerm;
    }
    
    public void setNivelPerm(String nivelPerm) {
        this.nivelPerm = nivelPerm;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Date getAdmissao() {
        return this.admissao;
    }
    
    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }




}



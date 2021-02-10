package udb.gl.moneytransfer.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String numpiece;
    @Column(length = 30)
    private String nom;
    @Column(length = 80)
    private String prenom;
    @Column(length = 15)
    private String tel;

    @JsonIgnore
    @OneToMany(mappedBy = "envoyeur")
    private List<Operation> envois;

    @JsonIgnore
    @OneToMany(mappedBy = "destinataire")
    private List<Operation> retraits;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumpiece() {
        return numpiece;
    }

    public void setNumpiece(String numpiece) {
        this.numpiece = numpiece;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Operation> getEnvois() {
        return envois;
    }

    public void setEnvois(List<Operation> envois) {
        this.envois = envois;
    }

    public List<Operation> getRetraits() {
        return retraits;
    }

    public void setRetraits(List<Operation> retraits) {
        this.retraits = retraits;
    }



}

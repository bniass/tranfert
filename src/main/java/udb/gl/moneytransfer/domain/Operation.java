package udb.gl.moneytransfer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date dateEnvoi;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date dateRecuperation;
    @Column(length = 20)
    private String code;
    private int montant;
    private int commission;
    private int commissionDepot;
    private int commissionRetrait;
    private int commissionEtat;
    private int commissionSysteme;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Client envoyeur;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client destinataire;

    @ManyToOne
    private User userEnvoyeur;

    @ManyToOne
    private User userRemetteur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateRecuperation() {
        return dateRecuperation;
    }

    public void setDateRecuperation(Date dateRecuperation) {
        this.dateRecuperation = dateRecuperation;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getCommissionDepot() {
        return commissionDepot;
    }

    public void setCommissionDepot(int commissionDepot) {
        this.commissionDepot = commissionDepot;
    }

    public int getCommissionRetrait() {
        return commissionRetrait;
    }

    public void setCommissionRetrait(int commissionRetrait) {
        this.commissionRetrait = commissionRetrait;
    }

    public int getCommissionEtat() {
        return commissionEtat;
    }

    public void setCommissionEtat(int commissionEtat) {
        this.commissionEtat = commissionEtat;
    }

    public int getCommissionSysteme() {
        return commissionSysteme;
    }

    public void setCommissionSysteme(int commissionSysteme) {
        this.commissionSysteme = commissionSysteme;
    }

    public Client getEnvoyeur() {
        return envoyeur;
    }

    public void setEnvoyeur(Client envoyeur) {
        this.envoyeur = envoyeur;
    }

    public Client getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Client destinataire) {
        this.destinataire = destinataire;
    }

    public User getUserEnvoyeur() {
        return userEnvoyeur;
    }

    public void setUserEnvoyeur(User userEnvoyeur) {
        this.userEnvoyeur = userEnvoyeur;
    }

    public User getUserRemetteur() {
        return userRemetteur;
    }

    public void setUserRemetteur(User userRemetteur) {
        this.userRemetteur = userRemetteur;
    }





}

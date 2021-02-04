package udb.gl.moneytransfer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int montantMin;
    private int montantMax;
    private int montantComm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontantMin() {
        return montantMin;
    }

    public void setMontantMin(int montantMin) {
        this.montantMin = montantMin;
    }

    public int getMontantMax() {
        return montantMax;
    }

    public void setMontantMax(int montantMax) {
        this.montantMax = montantMax;
    }

    public int getMontantComm() {
        return montantComm;
    }

    public void setMontantComm(int montantComm) {
        this.montantComm = montantComm;
    }
}

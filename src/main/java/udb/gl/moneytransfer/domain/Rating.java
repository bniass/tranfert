package udb.gl.moneytransfer.domain;

public enum Rating {
    DEPOSIT(0.1f),
    RETRAIT(0.2f),
    ETAT(0.3f),
    SYS(0.4f),
    TAUXCOMMISSION(0.2f);

    private final  float taux;

    Rating(float taux) {
        this.taux = taux;
    }
}

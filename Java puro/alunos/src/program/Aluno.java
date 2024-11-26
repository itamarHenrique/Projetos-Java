package program;

public class Aluno {

    private String primeiroNome;
    private String sobrenome;
    private String RA;
    private String unidadeDeEnsino;

    public Aluno(String primeiroNome, String sobrenome, String RA, String unidadeDeEnsino){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.RA = RA;
        this.unidadeDeEnsino = unidadeDeEnsino;
    }

    public Aluno(){
        
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public String getUnidadeDeEnsino() {
        return unidadeDeEnsino;
    }

    public void setUnidadeDeEnsino(String unidadeDeEnsino) {
        this.unidadeDeEnsino = unidadeDeEnsino;
    }

    @Override
    public String toString() {
        return "Aluno [primeiroNome=" + primeiroNome + ", sobrenome=" + sobrenome + ", RA=" + RA + ", unidadeDeEnsino="
                + unidadeDeEnsino + "]";
    }

}

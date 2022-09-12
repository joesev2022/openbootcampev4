package models;

public class Cliente extends Persona{
    private double credito;

    public Cliente(){
        super();
    }

    public Cliente(double credito){
        super();
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() +
                "credito=" + credito +
                '}';
    }
}

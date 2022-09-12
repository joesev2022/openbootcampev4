package models;

public class Trabajor extends Persona{
    private double salario;

    public Trabajor(){
        super();
    }

    public Trabajor(double salario){
        super();
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajor{" +
                super.toString() +
                "salario=" + salario +
                '}';
    }
}

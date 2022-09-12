import models.Cliente;
import models.Trabajor;

public class OpenBootCampEv4 {
    public static void main(String[] args) {
        Cliente unCliente = new Cliente();
        unCliente.setEdad(25);
        unCliente.setNombre("Miguel");
        unCliente.setTelefono(596859565);
        unCliente.setCredito(16.50);
        System.out.println("Mostrar Cliente: " + unCliente);
        Trabajor unTrabajor = new Trabajor();
        unTrabajor.setEdad(45);
        unTrabajor.setNombre("Javier");
        unTrabajor.setTelefono(949502123);
        unTrabajor.setSalario(2500);
        System.out.println("Mostrar Trabajador: " + unTrabajor);
    }
}

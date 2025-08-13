public class EmpleadoPorHoras extends Empleado {
    private String genero;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }
/* 
Pull Up Method
/* 
    @Override
    public void imprimirDetalles() {
      super.imprimirDetalles();
        System.out.println("Género: " + genero);
        System.out.println("Tarifa por hora: " + super.getTarifaHora());
        System.out.println("Salario calculado: " + calcularSalario());
    }
*/
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Género: " + genero);
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * super.getTarifaHora();
        return salario;
    }

    // Más metodos
}
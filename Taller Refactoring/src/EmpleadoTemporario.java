public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;
    private String genero;

    // Pull Up Field
    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Genero: " + genero);
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    //getters y setters
    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Más metodos
}

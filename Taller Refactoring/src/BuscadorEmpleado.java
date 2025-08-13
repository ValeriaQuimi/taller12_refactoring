import java.util.List;

public class BuscadorEmpleado {

    // Extract Method
    public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        return buscarEnListaEmpleados(nombre, empleados);
    }

    private static Empleado buscarEnListaEmpleados(String nombre, List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }


}

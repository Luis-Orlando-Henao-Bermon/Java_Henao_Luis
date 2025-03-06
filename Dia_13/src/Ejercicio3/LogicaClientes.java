package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {
    /*
    No cumple con el principio OCP: Open/Closed Principle
    ya que al momento de filtrar si quiere agregar un nuevo tipo de filtrado tendria que modificar la clase FiltoCliente
     */

    private List<Cliente> clientes =  new ArrayList<Cliente>();
    private FiltroClientes filtro = new FiltroClientes();

    public List<Cliente> getClientes() {
        return clientes;
    }


    // ...

    public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
        return filtro.filtroPorTipo(clientes, new FiltroPorLocalidad(localidad));
    }

    public List<Cliente> getClientesPorNombre(String nombre) {
        return filtro.filtroPorTipo(clientes, new FiltradoPorNombre(nombre));
    }

    public List<Cliente> getClientesConSaldo() {
        return filtro.filtroPorTipo(clientes,new FiltroConSaldo());
    }

    // ...
}

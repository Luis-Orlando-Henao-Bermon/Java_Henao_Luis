package Ejercicio3;

public class FiltroConSaldo implements TipoFiltrado{

    @Override
    public Boolean CumpleTipoFiltrado(Cliente cliente) {
        return cliente.getSaldo()>0;
    }
}

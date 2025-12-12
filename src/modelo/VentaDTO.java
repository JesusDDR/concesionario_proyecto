package modelo;

import java.time.LocalDate;

public class VentaDTO {

    private ClienteDTO cliente;
    private CocheDTO  coche;
    private LocalDate fecha;
    private double precioVenta;

    public VentaDTO(ClienteDTO cliente, CocheDTO coche, LocalDate fecha, double precioVenta) {
        this.cliente = cliente;
        this.coche = coche;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public CocheDTO getCoche() {
        return coche;
    }

    public void setCoche(CocheDTO coche) {
        this.coche = coche;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}

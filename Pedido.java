package com.mycompany.lavadorasapp;

import java.util.List;

public class Pedido {
    private static int contadorId = 0;
    private Cliente cliente;
    private Integer id;
    private ProgramaLavado programaLavado;
    private double kgRopa;
    private List<TipoRopa> tiposDeRopa;
    private String comentarios;
    private EstadoPedido estado;
    private String direccion;
    
    public Pedido(Cliente cliente, double kg, List<TipoRopa> tipoRopa,
        String direccion){
        if (kg<0 || kg>10){
            throw new IllegalArgumentException("El peso de la ropa debe estar entre 0 kg y 10 kg");
        }
        this.kgRopa = kg;
        this.cliente = cliente;
        this.id = contadorId ++;
        this.tiposDeRopa=tipoRopa;
        this.direccion = direccion;
        this.comentarios = "";
        this.estado= EstadoPedido.PENDIENTE;
        
        
    }

    public void setProgramaLavado(ProgramaLavado programaLavado) {
        this.programaLavado = programaLavado;
    }

    public void setKgRopa(double kgRopa) {
        this.kgRopa = kgRopa;
    }

    public void setTiposDeRopa(List<TipoRopa> tiposDeRopa) {
        this.tiposDeRopa = tiposDeRopa;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public enum ProgramaLavado {
        FRIO, MIXTO, DELICADO, ALGODON
    }
    
    public enum TipoRopa{
        CAMISETA, PANTALON, SUETER, ROPA_INTERIOR, CALCETINES //se puede añadir mas
    }
    
    public enum EstadoPedido {
        PENDIENTE, EN_PROCESO, COMPLETADO, CANCELADO
    }
    
    
}

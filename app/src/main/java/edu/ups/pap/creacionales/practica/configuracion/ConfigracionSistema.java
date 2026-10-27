package edu.ups.pap.creacionales.practica.configuracion;

public class ConfigracionSistema {
    private static ConfigracionSistema instancia;
    private double impuesto;

    private ConfigracionSistema() {
        impuesto = 15.0;
    }

    public static ConfigracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfigracionSistema();
        }
        return instancia;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    
}

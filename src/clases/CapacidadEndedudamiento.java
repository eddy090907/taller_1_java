package clases;

public class CapacidadEndedudamiento {
    int ingresosTotales;
    int gastosFijos;
    int gastoVaribales;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(int ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(int gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVaribales;
    }

    public void setGastoVaribales(int gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }

    public double getPOR_FIJO() {
        return POR_FIJO;
    }


    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento() {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
        double capacidadEndeudamiento = (ingresosTotales - (gastosFijos + gastoVaribales)) * POR_FIJO;
        return "Su capacidad de endeudamiento es: " + capacidadEndeudamiento;
    }

}

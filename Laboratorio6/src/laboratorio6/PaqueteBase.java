package laboratorio6;
class PaqueteBase implements PlanTuristico {
    @Override
    public double getCosto() {
        return 7000;
    }

    @Override
    public int getDuracion() {
        return 5;
    }
    public String getDescripcion() {
        return "Incluye: \nTiquetes Aereos \nHotel en habitacion estandar \nAlimentacionVuelta a la isla \nRecepcion con lei hawaiano y camiseta de Millonarios \n";
    }
}

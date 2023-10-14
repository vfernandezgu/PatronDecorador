package laboratorio6;
class Nature implements PlanTuristico {
    private final PlanTuristico planBase;

    public Nature(PlanTuristico planBase) {
        this.planBase = planBase;
    }

    @Override
    public double getCosto() {
        return planBase.getCosto() + 720;
    }

    @Override
    public int getDuracion() {
        return planBase.getDuracion() + 5;
    }

    public String getDescripcion() {
        return this.planBase.getDescripcion() + "Visitar el Kualoa Ranch\nVisitar el Maui Ocean Center\nVisitar el Akaka Falls State Park\n";
    }
}

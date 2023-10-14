package laboratorio6;
class PearlHarbor implements PlanTuristico {
    private final PlanTuristico planBase;

    public PearlHarbor(PlanTuristico planBase) {
        this.planBase = planBase;
    }

    @Override
    public double getCosto() {
        return planBase.getCosto() + 653;
    }

    @Override
    public int getDuracion() {
        return planBase.getDuracion() + 2;
    }
    public String getDescripcion() {
        return this.planBase.getDescripcion() + "Visitar el museo Pearl Harbor\nVisitar el palacio Iolani \nVisitar el museo BishopVisitar el USS ArizonaMemorial\n";
    }
}

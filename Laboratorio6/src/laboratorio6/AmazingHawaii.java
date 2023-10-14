package laboratorio6;
class AmazingHawaii implements PlanTuristico {
    private final PlanTuristico planBase;

    public AmazingHawaii(PlanTuristico planBase) {
        this.planBase = planBase;
    }

    @Override
    public double getCosto() {
        return planBase.getCosto() + 931;
    }

    @Override
    public int getDuracion() {
        return planBase.getDuracion() + 3;
    }
    public String getDescripcion() {
        return this.planBase.getDescripcion() + "Escalar el Waipio Valley\nSurfear en las playas Waikiki o Hanalei Bay\nBucear en Hanauma Bay\n";
    }
}

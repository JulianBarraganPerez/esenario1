public class AutomovilBuilder {
    protected String motor;
    protected String color;
    protected String llantas;
    protected String sonido;
    protected String interiores;
    protected boolean techoSolar;
    protected boolean gps;

    public AutomovilBuilder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public AutomovilBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public AutomovilBuilder setLlantas(String llantas) {
        this.llantas = llantas;
        return this;
    }

    public AutomovilBuilder setSonido(String sonido) {
        this.sonido = sonido;
        return this;
    }

    public AutomovilBuilder setInteriores(String interiores) {
        this.interiores = interiores;
        return this;
    }

    public AutomovilBuilder setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
        return this;
    }

    public AutomovilBuilder setGps(boolean gps) {
        this.gps = gps;
        return this;
    }

    public Automovil build() {
        return new Automovil(this);
    }
}

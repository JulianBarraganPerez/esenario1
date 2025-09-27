public class Automovil {
    private final String motor;
    private final String color;
    private final String llantas;
    private final String sonido;
    private final String interiores;
    private final boolean techoSolar;
    private final boolean gps;

    protected Automovil(AutomovilBuilder builder) {
        this.motor = builder.motor;
        this.color = builder.color;
        this.llantas = builder.llantas;
        this.sonido = builder.sonido;
        this.interiores = builder.interiores;
        this.techoSolar = builder.techoSolar;
        this.gps = builder.gps;
    }

    public String getMotor() { return motor; }
    public String getColor() { return color; }
    public String getLlantas() { return llantas; }
    public String getSonido() { return sonido; }
    public String getInteriores() { return interiores; }
    public boolean hasTechoSolar() { return techoSolar; }
    public boolean hasGps() { return gps; }

    @Override
    public String toString() {
        return "Automovil {" +
                "motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", llantas='" + llantas + '\'' +
                ", sonido='" + sonido + '\'' +
                ", interiores='" + interiores + '\'' +
                ", techoSolar=" + techoSolar +
                ", gps=" + gps +
                '}';
    }
}

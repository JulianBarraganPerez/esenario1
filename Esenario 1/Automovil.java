public class Automovil {
    private final String motor;
    private final String color;
    private final String llantas;
    private final String sonido;
    private final String interiores;
    private final boolean techoSolar;
    private final boolean gps;

    private Automovil(AutomovilBuilder builder) {
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

    public static class AutomovilBuilder {
        private String motor;
        private String color;
        private String llantas;
        private String sonido;
        private String interiores;
        private boolean techoSolar;
        private boolean gps;

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
}

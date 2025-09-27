public class Main {
    public static void main(String[] args) {
        Automovil deportivo = new Automovil.AutomovilBuilder()
                .setMotor("V8")
                .setColor("Rojo")
                .setLlantas("Deportivas")
                .setSonido("Bose")
                .setInteriores("Cuero Premium")
                .setTechoSolar(true)
                .setGps(true)
                .build();

        Automovil electrico = new Automovil.AutomovilBuilder()
                .setMotor("Eléctrico")
                .setColor("Azul")
                .build();

        Automovil economico = new Automovil.AutomovilBuilder()
                .setMotor("1.6")
                .setColor("Blanco")
                .setInteriores("Tela")
                .build();

        System.out.println(deportivo);
        System.out.println(electrico);
        System.out.println(economico);
    }
}

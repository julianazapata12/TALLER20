package TourFrancia;


import java.util.concurrent.atomic.AtomicInteger;

public class AppTour {
    public static void main(String[] args) {
        Tour tour = new Tour();

        //Se crean los equipos
        Equipo alfa = new Equipo((byte) 1,"alfa", "Mexico");
        Equipo beta = new Equipo((byte) 2, "beta", "Argentina");
        Equipo omega = new Equipo((byte) 3, "omega", "Brasil");
        Equipo chipi = new Equipo((byte) 4, "chipi", "España");
        Equipo mor = new Equipo((byte) 5, "mor", "Uruguay");

        //Se crean los corredores
        Corredor roman = new Corredor((byte) 1, "roman", "COL", (byte) 25, alfa);
        Corredor andre = new Corredor((byte) 2, "Andre", "MEX", (byte) 30, alfa);
        Corredor ricardo = new Corredor((byte) 3, "Ricardo", "ECU", (byte) 28, alfa);
        Corredor jhoan = new Corredor((byte) 4, "Jhoan", "COL", (byte) 19, alfa);
        Corredor michel = new Corredor((byte) 5, "Michel", "URU", (byte) 32, alfa);
        Corredor lucas = new Corredor((byte) 6, "Lucas", "BRA", (byte) 18, alfa);
        Corredor doris = new Corredor((byte) 7, "doris", "RUS", (byte) 35, alfa);
        Corredor piter = new Corredor((byte) 8, "Piter", "MEX", (byte) 27, beta);
        Corredor samuuel = new Corredor((byte) 9, "samuel", "ALE", (byte) 22, beta);
        Corredor beto = new Corredor((byte) 10, "beto", "BRA", (byte) 25, beta);
        Corredor leonardo = new Corredor((byte) 11, "Leonardo", "ARG", (byte) 29, beta);
        Corredor gabriel = new Corredor((byte) 12, "Gabriel", "COL", (byte) 32, beta);
        Corredor danielito = new Corredor((byte) 13, "Danielito", "MEX", (byte) 23, beta);
        Corredor alfonso = new Corredor((byte) 14, "alfonso", "PAN", (byte) 36, beta);
        Corredor rodolfo = new Corredor((byte) 15, "Rodolfo", "ECU", (byte) 35, omega);
        Corredor simon = new Corredor((byte) 16, "simon", "URU", (byte) 33, omega);
        Corredor hugo = new Corredor((byte) 17, "Hugo", "URU", (byte) 25, omega);
        Corredor sergio = new Corredor((byte) 18, "Sergio", "COL", (byte) 32, omega);
        Corredor camilo = new Corredor((byte) 19, "camilo", "MEX", (byte) 28, omega);
        Corredor danilo = new Corredor((byte) 20, "danilo", "COL", (byte) 19, omega);
        Corredor nelson = new Corredor((byte) 21, "Nesol", "USA", (byte) 30, omega);
        Corredor pancho = new Corredor((byte) 22, "pancho", "COL", (byte) 29, chipi);
        Corredor walter = new Corredor((byte) 23, "walter", "BRA", (byte) 32, chipi);
        Corredor sisco = new Corredor((byte) 24, "sisco", "ECU", (byte) 24, chipi);
        Corredor kevin = new Corredor((byte) 25, "Kevin", "FRA", (byte) 26, chipi);
        Corredor dayron = new Corredor((byte) 26, "Dayron", "COL", (byte) 36, chipi);
        Corredor diego = new Corredor((byte) 27, "Diego", "ARG", (byte) 24, chipi);
        Corredor carlos = new Corredor((byte) 28, "Carlos", "FRA", (byte) 26, chipi);
        Corredor miguel = new Corredor((byte) 29, "Miguel", "COL", (byte) 28, mor);
        Corredor omar = new Corredor((byte) 30, "Omar", "ESP", (byte) 33, mor);
        Corredor james = new Corredor((byte) 31, "james", "URU", (byte) 19, mor);
        Corredor gonzalo = new Corredor((byte) 32, "gonzalo", "COL", (byte) 25, mor);
        Corredor quiroz = new Corredor((byte) 33, "quiroz" , "ESP", (byte) 18, mor);
        Corredor jarol = new Corredor((byte) 34, "jarol", "ALE", (byte) 28, mor);
        Corredor zapata = new Corredor((byte) 35, "zapata", "COL", (byte) 28, mor);

        //Se crean las etapas
        Etapa etapa1 = new Etapa((byte) 1, "primer", "primer", "primer");
        Etapa etapa2 = new Etapa((byte) 2, "primer", "primer", "primer");
        Etapa etapa3 = new Etapa((byte) 3, "Segun", "Segun", "Segun");
        Etapa etapa4 = new Etapa((byte) 4, "Segun - rop - menson", "Segun", "rop - menson");
        Etapa etapa5 = new Etapa((byte) 5, "Gap - Pivas", "Gap", "Privas");
        Etapa etapa6 = new Etapa((byte) 6, "Lento - Monte", "Lento", "Monte");
        Etapa etapa7 = new Etapa((byte) 7, "Millas - Letu", "Millas", "Latu");
        Etapa etapa8 = new Etapa((byte) 8, "Caspar-sur-Gaspa - subida", "Caspar-sur-Gaspa", "subida");
        Etapa etapa9 = new Etapa((byte) 9, "bajada - Larga", "bajada", "larga");
        Etapa etapa10 = new Etapa((byte) 10, "orion - ira", "orion", "ira");
        Etapa etapa11 = new Etapa((byte) 11, "Chevi-Plage - Poi", "Chevi", "Poi");
        Etapa etapa12 = new Etapa((byte) 12, "Chau - Sara", "Chau", "Sara");
        Etapa etapa13 = new Etapa((byte) 13, "Chatica-Gon - Mary", "Chatica-Gon", "Mary");
        Etapa etapa14 = new Etapa((byte) 14, "Ferr - Lion", "Ferr", "Lion");
        Etapa etapa15 = new Etapa((byte) 15, "Lion - Grand", "Lion", "Grand ");
        Etapa etapa16 = new Etapa((byte) 16, "pudin - billard", "pudin", "billard");
        Etapa etapa17 = new Etapa((byte) 17, "Gren - Maribel", "Gren", "Maribel");
        Etapa etapa18 = new Etapa((byte) 18, "Méribel - La Roche-sur-Foron", "Maribel", "La Roche-sur-Foron");
        Etapa etapa19 = new Etapa((byte) 19, "Bruss - Champan", "Bruss", "Champan");
        Etapa etapa20 = new Etapa((byte) 20, "Lore - Planchon", "Lore", "Planchon");
        Etapa etapa21 = new Etapa((byte) 21, "julia - polar", "julia", "Polar");

        //Inscribir corredores en equipos
        alfa.inscribirCorredores(roman, andre, ricardo, jhoan, michel, lucas, doris);
        beta.inscribirCorredores(piter, samuuel, beto, leonardo, gabriel, danielito, alfonso);
        omega.inscribirCorredores(rodolfo, simon, hugo, sergio, camilo, danilo, nelson);
        chipi.inscribirCorredores(pancho, walter, sisco, kevin, dayron,  diego, carlos);
        mor.inscribirCorredores(miguel, omar, james, gonzalo, quiroz, jarol, zapata);

        //Inscribir equipos en el Tour
        tour.inscribirEquiposTour(alfa, beta, omega, chipi, mor);

        //Inscribir equipos en la etapa
        etapa1.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa2.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa3.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa4.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa5.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa6.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa7.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa8.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa9.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa10.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa11.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa12.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa13.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa14.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa15.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa16.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa17.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa18.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa19.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa20.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);
        etapa21.inscribirEquiposEtapa(alfa, beta, omega, chipi, mor);

        //Conocer todos los equipos de Tour
        System.out.println("Equipos que participan del Tour:");
        tour.getEquipos().forEach(equipo -> {
            System.out.println("El equipo " + equipo.getNombre() + " participa del Tour 2020");
        });

        //Corredores de un equipo ordenados
        System.out.println();
        System.out.println("Corredores ordenados: alfa");
        alfa.getCorredoresOrdenados().forEach(corredor -> {
            System.out.println(corredor.getNombre() + " - " + corredor.getEdad());
        });

        System.out.println();
        System.out.println("Corredores ordenados: beta");
        beta.getCorredoresOrdenados().forEach(corredor -> {
            System.out.println(corredor.getNombre() + " - " + corredor.getEdad());
        });

        //Resultados de etapa
        System.out.println();
        System.out.println("Resultados de etapa");
        System.out.println("El ganador de la etapa " + etapa1.getNombre() + " es: "+ etapa1.resultadosEtapa().getNombre() + " del Equipo: "+ etapa1.resultadosEtapa().getEquipo().getNombre() + " y de Nacionalidad: "+ etapa1.resultadosEtapa().getPais());

        //Top 10
        System.out.println();
        System.out.println("El top 10 del Tour 2020 es:");
        AtomicInteger i = new AtomicInteger();
        tour.getTop10().forEach(corredor -> {
            System.out.println((i.incrementAndGet()) +" Corredor: "+ corredor.getNombre() +" - Equipo: "+ corredor.getEquipo().getNombre() +" - Nacionalidad: "+ corredor.getPais());
        });
    }
}

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Da vinci Tournament");//mensaje salida
        String lugarDelParcial = new String("Aula 116, Da Vinci");//creamos lugar
        Season torneoDaVinci = new Season();   //creamos torneo
        Date fechaPosibleParcial = new Date(2022,8,29); //creamos fecha

        Match primerParcial = new Match(lugarDelParcial,fechaPosibleParcial );// creamos partido

        TeamSeason profesoresPOO = new TeamSeason("Profes POO",1);
        TeamSeason estudiantesFC = new TeamSeason("Estudiantes FC",0);
        TeamSeason recursantesFC = new TeamSeason("Recursantes FC");

        Player profeSergio=new Player("Sergio Medina",1,"Goalkeeper");
        Player profeSuplente=new Player("Benito Camela",13,"Goalkeeper");

        profesoresPOO.addPlayer(profeSergio);
        profesoresPOO.addPlayer(profeSuplente);

      /*  profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0); agregue a constructor*/

        primerParcial.setLocalTeam(profesoresPOO);
        primerParcial.setVisitantTeam(estudiantesFC);

    }
}
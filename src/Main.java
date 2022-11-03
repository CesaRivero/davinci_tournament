import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Da vinci Tournament");//mensaje salida
        String lugarDelParcial = new String("Aula 116, Da Vinci");//creamos lugar
        Season torneoDaVinci = new Season();   //creamos torneo
        Date fechaPosibleParcial = new Date(2022,8,29); //creamos fecha


        TeamSeason profesoresPOO = new TeamSeason("Profes POO",1);
        TeamSeason estudiantesFC = new TeamSeason("Estudiantes FC",0);
        TeamSeason recursantesFC = new TeamSeason("Recursantes FC");

        Match primerParcial = new Match(lugarDelParcial,fechaPosibleParcial ,profesoresPOO,estudiantesFC);// creamos partido

        //creamos jugadores equipo 1
        Player profeSergio=new Player("Sergio Medina",1,"Goalkeeper");
        Player profeSuplente=new Player("Benito Camela",13,"Central Defender");
        Player profeWeb= new Player("Pedro Perez",5,"Central Defender");
        Player profeUx= new Player("Julio Casares",8,"Midfielder");
        Player profeJava = new Player("Elda Montoto",9,"Forward");

        //agregamos jugadores al equipo 1
        profesoresPOO.addPlayer(profeSergio);
        profesoresPOO.addPlayer(profeSuplente);
        profesoresPOO.addPlayer(profeWeb);
        profesoresPOO.addPlayer(profeUx);
        profesoresPOO.addPlayer(profeJava);

        //creamos jugadores equipo 2
        Player maxi=new Player("Maxi Grippo",1,"Goalkeeper");
        Player franco=new Player("Franco",5,"Central Defender");
        Player nachoide = new Player( "Ignacio Armendariz",4,"Central Defender");
        Player cesarRivero=new Player("Cesar Rivero",10,"Midfielder");
        Player luisDiaz=new Player("Luis Diaz",9,"Forward");

        //agregamos jugadores a equipo 2
        estudiantesFC.addPlayer(maxi);
        estudiantesFC.addPlayer(franco);
        estudiantesFC.addPlayer(nachoide);
        estudiantesFC.addPlayer(cesarRivero);
        estudiantesFC.addPlayer(luisDiaz);

      /*  profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0); agregue a constructor*/

       /* primerParcial.setLocalTeam(profesoresPOO);
        primerParcial.setVisitantTeam(estudiantesFC); agregamos como constructor */

        primerParcial.makeLocalGoal(0);
        primerParcial.makeLocalGoal(4);
        primerParcial.makeVisitantGoal(1);
        primerParcial.makeVisitantGoal(4);

        System.out.println(primerParcial.generateMarker());

    }
}
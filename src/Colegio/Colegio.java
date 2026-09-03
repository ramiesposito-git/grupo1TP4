package Colegio;


public class Colegio {

    public static void main(String[] args) {
        
        //instancia de 3 materias
        Materia web2 = new Materia(3, "Web 2", 2);
        Materia matematica = new Materia(6, "Matematicas", 1);
        Materia lab1 = new Materia(8, "Laboratorio 1", 1);
        
        //instancia de 2 alumnos
        Alumno al1 = new Alumno(1001, "Lopez", "Martin");
        Alumno al2 = new Alumno(1002, "Martinez", "Brenda");
        
        //se agrega al alumno 1 a las 3 materias
        al1.agregarMateria(web2);
        al1.agregarMateria(matematica);
        al1.agregarMateria(lab1);
        
        //se agrega al alumno 2 a las 3 materias y se inscribe nuevamente a lab1...
        al2.agregarMateria(web2);
        al2.agregarMateria(matematica);
        al2.agregarMateria(lab1);
        al2.agregarMateria(lab1);
        
        //se muestra por pantalla la cantidad de materias a las que esta inscripto cada alumno
        System.out.println(al1.getNombre() +" esta inscripto en: " + al1.cantidadMaterias() +" materias.\n" + al2.getNombre() + " esta incripta en: " + al2.cantidadMaterias() + " materias.");
            
    }
    
}

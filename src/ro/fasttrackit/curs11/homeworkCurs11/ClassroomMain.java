package ro.fasttrackit.curs11.homeworkCurs11;

import static ro.fasttrackit.curs11.homeworkCurs11.ReadStudentInfo.readObjectsFromFile;
import static ro.fasttrackit.curs11.homeworkCurs11.ReadStudentInfo.readStudent;

public class ClassroomMain {
    public static void main(String[] args) throws Exception {
        Classroom classroom = new Classroom(readObjectsFromFile());
        System.out.println("Media pentru disciplina : " + classroom.getAverageGrade("Computer Science"));
        System.out.println("Notele pentru disciplina: " + classroom.getGradesForDiscipline("Computer Science"));
        System.out.println("Notele studentului : " + classroom.getGradesForStudent("Amilia Hilaria"));
        System.out.println("Nota cea mai mare : " + classroom.getMaxGrade());
        System.out.println("Nota cea mai mica pentru disciplina selectata : " + classroom.getWorstGrade("Computer Science"));
        System.out.println("Nota cea mai mare pentru disciplina selectata : " + classroom.getMaxDisciplineGrade("Mathematics"));
    }
}
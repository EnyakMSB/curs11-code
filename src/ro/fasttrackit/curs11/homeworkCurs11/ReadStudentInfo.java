package ro.fasttrackit.curs11.homeworkCurs11;

import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class ReadStudentInfo {
    public static void main(String[] args) throws Exception {
        List<StudentGrade> students = readObjectsFromFile();
        students.forEach(System.out::println);
    }

    public static List<StudentGrade> readObjectsFromFile()throws Exception {
        List<StudentGrade> students = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/grades.txt"));
        String line;
        while ((line = fileReader.readLine()) != null) {
            students.add(readStudent(line));
        }
        return students;
    }

    public static StudentGrade readStudent(String studentInfo) {
        String[] studentData = studentInfo.split("\\|");
        String name = studentData[0];
        String discipline = studentData[1];
        int grade = Integer.parseInt(studentData[2]);
        return new StudentGrade(name, discipline, grade);
    }

}

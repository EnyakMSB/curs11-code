package ro.fasttrackit.curs11.homeworkCurs11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> classroom;

    public Classroom(List<StudentGrade> classroom) {
        this.classroom = new ArrayList<>();
        this.classroom.addAll(classroom);
    }

    public int getWorstGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline(discipline);
        int worstGrade = result.get(0);
        for (Integer grade : result) {
            if (worstGrade > grade) {
                worstGrade = grade;
            }
        }
        return worstGrade;
    }

    public int getMaxGrade() {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : classroom) {
            result.add(student.getGrade());
        }
        return Collections.max(result);
    }

    public Integer getMaxDisciplineGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline(discipline);
        for (StudentGrade student : classroom) {
            result.add(student.getGrade());
        }
        return Collections.max(result);
    }

    public int getAverageGrade(String discipline) {
        List<Integer> result = getGradesForDiscipline(discipline);
        int gradesVal = 0;
        for (StudentGrade student : classroom) {
            if (student.getDiscipline().equals(discipline)) {
                gradesVal += student.getGrade();
            }
        }
        return gradesVal / result.size();
    }

    public List<StudentGrade> getGradesForStudent(String name) {
        List<StudentGrade> result = new ArrayList<>();
        for (StudentGrade student : classroom) {
            if (student.getName().equals(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : classroom) {
            if (student.getDiscipline().equals(discipline)) {
                result.add(student.getGrade());
            }
        }
        return result;
    }
}
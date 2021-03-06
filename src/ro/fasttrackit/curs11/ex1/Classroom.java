package ro.fasttrackit.curs11.ex1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentsList;

    public Classroom(List<StudentGrade> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new ArrayList<>();
        for (StudentGrade person : studentsList) {
            if (discipline.equalsIgnoreCase(person.getDiscipline())) {
                gradesForDiscipline.add(person.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public StudentGrade getGradesForStudent(String studentName) {
        StudentGrade findStudent = null;
        for (StudentGrade person : studentsList) {
            if (studentName.equalsIgnoreCase(person.getName())) {
                findStudent = person;
            }
        }
        return findStudent;
    }
        
    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade student = null;
        for (StudentGrade person : studentsList) {
            if (discipline.equalsIgnoreCase(person.getDiscipline())
                    && (student == null || person.getGrade() > student.getGrade())) {
                student=person;
            }
        }
        return student;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade student=null;
        for (StudentGrade person : studentsList) {
            if (student == null || person.getGrade() > student.getGrade()) {
                student = person;
            }
        }
        return student;
    }

    public int getAverageGrade(String discipline){
        int sum=0;
        int numitor=getGradesForDiscipline(discipline).size();
        for (int grade: getGradesForDiscipline(discipline)){
            sum+=grade;
        }
        return sum/numitor;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade student = null;
        for (StudentGrade person : studentsList) {
            if (discipline.equalsIgnoreCase(person.getDiscipline())
                    && (student == null || person.getGrade() < student.getGrade())) {
                student=person;
            }
        }
        return student;
    }
}

package ro.fasttrackit.curs11.ex1;

public class Main {
    public static void main(String[] args) throws Exception {
        Classroom classroom = new Classroom("files/grades.txt");
        System.out.println(classroom.getGradesForDiscipline("mathematics"));
        System.out.println(classroom.getGradesForStudent("Utu Arcadius"));
        System.out.println(classroom.getMaxGrade("physics"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("mathematics"));
        System.out.println(classroom.getWorstGrade("mathematics"));
    }
}

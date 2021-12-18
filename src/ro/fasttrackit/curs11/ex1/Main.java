package ro.fasttrackit.curs11.ex1;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomReader customReader = new CustomReader("files/grades.txt");
        Classroom classroom = new Classroom(customReader.getList());
        System.out.println(classroom.getGradesForDiscipline("mathematics"));
        System.out.println(classroom.getGradesForStudent("Utu Arcadius"));
        System.out.println(classroom.getMaxGrade("physics"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("mathematics"));
        System.out.println(classroom.getWorstGrade("mathematics"));
    }
}

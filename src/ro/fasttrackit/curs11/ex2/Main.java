package ro.fasttrackit.curs11.ex2;

import ro.fasttrackit.curs11.ex1.Classroom;

public class Main {
    public static void main(String[] args) throws Exception {
        ReportGenerator reportGenerator=new ReportGenerator("files/grades.txt");

        reportGenerator.generateReport("files/grade-reports.out", new Classroom("files/grades.txt"),"mathematics");

    }
}

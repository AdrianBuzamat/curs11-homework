package ro.fasttrackit.curs11.ex2;

import ro.fasttrackit.curs11.ex1.Classroom;
import ro.fasttrackit.curs11.ex1.CustomReader;
import ro.fasttrackit.curs11.ex1.StudentGrade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class ReportGenerator {
    private List<StudentGrade> list;

    public ReportGenerator(String pathList) throws Exception {
        this.list = new CustomReader(pathList).getList();
    }

    public void generateReport(String pathToSave, Classroom classroom, String discipline) throws Exception {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(pathToSave))){
            writer.write(classroom.getMaxGrade().toString());
            writer.write(classroom.getAverageGrade(discipline));
            writer.write(classroom.getWorstGrade(discipline).toString());
        }
    }
}

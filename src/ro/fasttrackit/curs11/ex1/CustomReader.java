package ro.fasttrackit.curs11.ex1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomReader {

    private FileReader file;

    public CustomReader(String path) throws FileNotFoundException {
        this.file= new FileReader(path);
    }

    public List<StudentGrade> getList() throws Exception {
        BufferedReader myReader = new BufferedReader(file);
        List<StudentGrade> result =new ArrayList<>();
        String line;
        while((line=myReader.readLine()) !=null){
            result.add(readPerson(line));
        }
        return result;
    }

    private StudentGrade readPerson(String line) {
        String[] personData=line.split("\\|");

        String name = personData[0];
        String discipline = personData[1];
        int grade = Integer.parseInt(personData[2]);

        return new StudentGrade(name,discipline,grade);

    }

}

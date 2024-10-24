package Level2;

import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

public class Person {
    private ArrayList<String> jobs = new ArrayList<String>();

    public Person(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    public String getJobs(int index) throws ArrayIndexOutOfBoundsException{
        if (index>jobs.size()-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return jobs.get(index);
    }
}

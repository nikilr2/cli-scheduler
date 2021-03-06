import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Args {

    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names={"--start", "-s"})
    long startTime = -1;

    @Parameter(names={"--end", "-e"})
    long endTime = -1;

    @Parameter(names={"--task", "-t"})
    String taskName;

    public void run() {
        System.out.printf("%d %d", startTime, endTime);
        System.out.println(" " + taskName);
    }
}

package org.web;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class App {
    @Parameter(description = "[ToDOfile] to create new file or use exists file", arity = 1)
    private List<String> files;

    @Parameter(names = {"-a", "--add"}, description = "Usage: todolist [ToDOFile] (-a/--add) [item]")
    private boolean add = false;

    @Parameter(names = {"-d, --delete"}, description = "Usage: t0dolist [ToDOFile] (-d/--delete) [item]")
    private boolean delete = false;

    @Parameter(names = {"--done", "--complete", "-do"}, description = "Usage: todolist [ToDOFile] (--done/--complete/-c) [Number of item]")
    private int done = 0;

    @Parameter(names = {"--print", "-p"}, description = "Usage: todolist [ToDOFile] (--print/-p)")
    private boolean print = false;

    @Parameter(names = {"--time", "-t"}, description = "Usage: in [item] use --time xx/xx/xx for day, --time xx:xx for time.(default today) or --time xx/xx/xx - xx:xx for full date")
    private String date;

    @Parameter(names = {"--content", "-c"}, description = "Usage in [item] use --content xxxx for add content")
    private String content;

    @Parameter(names = {"-h", "--help"}, help = true)
    private boolean help;

    public static App main(String ... args) {
        App app = new App();
        JCommander.newBuilder()
                .addObject(app)
                .build()
                .parse(args);

        return app;
    }

    public void run() {
        System.out.println();
    }

}
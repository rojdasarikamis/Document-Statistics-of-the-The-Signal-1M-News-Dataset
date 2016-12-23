package edu.ceng;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;
import java.time.Month;

import static edu.ceng.Helper.*;


class Arguments {


    @Option(name = "-file", required = true, usage = "path to json file")
    public String file;

    @Option(name = "-field", required = true, usage = "Define field of articles")
    public FIELD field;

    @Option(name = "-month", required = true, usage = "Specify month of articles was released")
    public Month month;

    @Option(name = "-type", required = true, usage = "Specify type of article")
    public TYPE type;
}

public class Main {

  

    private int run(String[] args) throws IOException {

        Arguments arguments = new Arguments();
        CmdLineParser parser = new CmdLineParser(arguments);

        try{

            parser.parseArgument(args);

        } catch (CmdLineException e) {

            return 1;
        }

        printStats(arguments.file, arguments.field, arguments.month, arguments.type);

        return 0;
    }

    public static void main(String[] args) throws IOException {

        System.exit(new Main().run(args));
    }
}
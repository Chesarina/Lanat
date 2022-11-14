import argparser.*;
import argparser.utils.UtlString;

import java.io.BufferedReader;
import java.io.IOException;

class Ball extends ArgumentType<Integer> {
	@Override
	public void parseArgValues(String[] args) {
		this.addError("This is a test error", 0, ErrorLevel.INFO);
	}
}

public class SimpleTests {
	public static void main(String[] args) {
		var argParser = new ArgumentParser("SimpleTesting") {{
			addArgument(new Argument<>("what", ArgumentType.FILE()));
			addSubCommand(new Command("subcommand") {{
				addArgument(new Argument<>("what", ArgumentType.FILE()));
				addArgument(new Argument<>("hey", new Ball()));
			}});
		}};
		argParser.parseArgs("subcommand --what D:\\\\program files\\\\Steam\\\\steamapps\\\\common\\\\Portal\\ 2\\\\gameinfo.txt --hey 12");
	}
}

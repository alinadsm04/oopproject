package projectSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        System.out.println("Выбеите число: \n1 \n2");
        if (line == "2") {
        	System.out.println(line);
        }
	}

}

package Exam2;

// The crash-incidents.csv file contains data of road crash-incidents.
// (id; location; surface type; surface condition; light condition; weather condition; crash date; year)
// Your task will be to count how many crash-incidents happened at good/bad
// weather conditions.
// Good weather conditions are CLOUDY and CLEAR.
// Bad weather conditions are RAIN, FREEZING RAIN, SNOW, FOG and SEVERE CROSSWINDS.
// So create the necessary method(s) that returns with the amount of crash-incidents.
// And print the return value to the console:
// The amount of crashes at good weather conditions: {amount}
// The amount of crashes at bad weather conditions: {amount}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Crashes {
  public static void main(String[] args) {

    weatherConditionCounter("crash-incidents.csv");

  }
  private static void weatherConditionCounter (String filename) {
    int goodwathers = 0;
    int badweathers = 0;
    try {
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
      lines.remove(lines.size()-1);
      for (int i = 0; i < lines.size(); i++) {
        String[] line = lines.get(i).split(";");
        if(line[5].equals("CLOUDY") || line[5].equals("CLEAR")){
          goodwathers++;
        } else {
          badweathers++;
        }
      }

      System.out.println("Good conditions: " + goodwathers);
      System.out.println("Bad conditions: " + badweathers);

    } catch (IOException e) {
      System.out.println("No such file");
    }
  }
}

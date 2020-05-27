import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File levelPackDir = new File("levels");
        File[] levelPackFiles = levelPackDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        assert levelPackFiles != null;

        final ArrayList<StringBuilder> levelStrings = new ArrayList<>();
        final ArrayList<Integer[]> levelSizes = new ArrayList<>();

        levelStrings.add(new StringBuilder());
        levelSizes.add(new Integer[] { 0, 0 });

        Files.lines(levelPackFiles[0].toPath()).forEachOrdered(line -> {
            if (!line.trim().startsWith(";") && !line.trim().isEmpty()) {
                int lastLevel = levelStrings.size() - 1;
                levelStrings.get(lastLevel).append(line).append("\n");
                ++levelSizes.get(lastLevel)[1];
                if (line.trim().length() > levelSizes.get(lastLevel)[0]) {
                    levelSizes.get(lastLevel)[0] = line.trim().length();
                }
            } else {
                // TODO: parse the level to construct the object model

                int lastLevel = levelStrings.size() - 1;
                if (!levelStrings.get(lastLevel).toString().isEmpty()) {
                    levelStrings.add(new StringBuilder());
                    levelSizes.add(new Integer[] { 0, 0 });
                }
            }
        });

        System.out.println(levelStrings.get(0));
        System.out.printf("%d, %d%n", levelSizes.get(0)[0], levelSizes.get(0)[1]);
    }
}

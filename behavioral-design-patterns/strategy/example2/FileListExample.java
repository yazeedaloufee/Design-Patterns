import java.io.File;
import java.io.FilenameFilter;

public class FileListExample {
    public static void main(String[] args) {
        // Specify the directory (current directory in this case)
        File dir = new File("..\\Design-Patterns\\behavioral-design-patterns\\strategy\\example2");

        // Check if the directory exists and is readable
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("The specified path is not a directory or does not exist.");
            return;
        }

        // Strategy: List only Java files
        String[] javaFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        // Check if the list is null (permissions issue)
        if (javaFiles == null) {
            System.out.println("Unable to read the directory. Check permissions.");
            return;
        }

        // Print the list of Java files
        if (javaFiles.length == 0) {
            System.out.println("No Java files found in the directory.");
        } else {
            System.out.println("Java files in directory:");
            for (String file : javaFiles) {
                System.out.println(file);
            }
        }
    }
}
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriteExample {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // 프로퍼티를 설정합니다.
        properties.setProperty("app.name", "PropertyExampleFile");
        properties.setProperty("app.version", "1.0.0");
        properties.setProperty("app.author", "John Doe");

        // 파일을 저장할 경로를 지정합니다.
        String directoryPath = "C:/public/study/Study_Note/Word_Dictionary/Property";
        File directory = new File(directoryPath);

        // 디렉토리가 존재하지 않으면 생성합니다.
        if (!directory.exists()) {
            boolean dirsCreated = directory.mkdirs();
            if (dirsCreated) {
                System.out.println("Directories were created: " + directoryPath);
            } else {
                System.out.println("Failed to create directories: " + directoryPath);
            }
        }

        // 파일 경로를 지정합니다.
        File propertiesFile = new File(directory, "app.propertiesExampleFile");

        try (FileOutputStream output = new FileOutputStream(propertiesFile)) {
            // 프로퍼티를 파일에 저장합니다.
            properties.store(output, "Application Properties Sample");
            System.out.println("Properties have been saved to " + propertiesFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
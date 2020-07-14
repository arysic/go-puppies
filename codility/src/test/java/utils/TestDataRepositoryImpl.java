package utils;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Repository
public class TestDataRepositoryImpl implements TestDataRepository {

    private String readFromFile(File file) throws IOException {
        return Files.readString(file.toPath());
    }

    @Override
    public String fetchData(File file) throws IOException {
        return readFromFile(file);
    }
}

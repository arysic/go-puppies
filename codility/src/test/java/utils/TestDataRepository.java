package utils;

import java.io.File;
import java.io.IOException;

public interface TestDataRepository {
    String fetchData(File file) throws IOException;
}

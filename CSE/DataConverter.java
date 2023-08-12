package CSE;

public class DataConverter {
    public void copyFlatFilesToTables() {  }
    public void close() throws Exception {
        throw new RuntimeException();
    }
}

class DataConverterMain {
    public static void main(String[] args) throws Exception {
        try (DataConverter dc = new DataConverter())
        {  dc.copyFlatFilesToTables(); }
    }
}

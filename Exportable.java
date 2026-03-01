public interface Exportable {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

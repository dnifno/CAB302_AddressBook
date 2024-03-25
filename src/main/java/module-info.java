module org.example.w5_address_book {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.w5_address_book to javafx.fxml;
    exports org.example.w5_address_book;
}
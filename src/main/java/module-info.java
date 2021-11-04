module ru.qeekbrains.javafx.hw_4_fromjavapart2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.qeekbrains.javafx.hw_4_fromjavapart2 to javafx.fxml;
    exports ru.qeekbrains.javafx.hw_4_fromjavapart2;
}
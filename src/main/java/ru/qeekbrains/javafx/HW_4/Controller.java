package ru.qeekbrains.javafx.HW_4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea chatHistory;

    @FXML
    TextField chat;

    @FXML
    protected void onHelloButtonClick() {
        chatHistory.appendText(chat.getText() + '\n');
        chat.clear();
    }
}
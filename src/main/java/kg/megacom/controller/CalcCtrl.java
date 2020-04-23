package kg.megacom.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class CalcCtrl {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Rectangle txtRctngl;

    @FXML
    private Button num7;

    @FXML
    private Button num8;

    @FXML
    private Button num9;

    @FXML
    private Button division;

    @FXML
    private Button num4;

    @FXML
    private Button num5;

    @FXML
    private Button num6;

    @FXML
    private Button multiplication;

    @FXML
    private Button num1;

    @FXML
    private Button num2;

    @FXML
    private Button num3;

    @FXML
    private Button minus;

    @FXML
    private Button clear;

    @FXML
    private Button num0;

    @FXML
    private Button point;

    @FXML
    private Button plus;

    @FXML
    void initialize() {

    }

    private double value1 = 0;
    private double value2 = 0;
    @FXML
    private Text output;
    //start new operation
    private boolean start = true;
    private String operator = "";

    private void processNums(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    private void processOperators(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty()) return;
            operator = value;
            value1 = Double.parseDouble(output.getText());
            output.setText("");
        } else {
            if (operator.isEmpty()) return;
        }
    }
}
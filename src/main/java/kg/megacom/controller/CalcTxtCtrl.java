package kg.megacom.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class CalcTxtCtrl {
    @FXML
    private Label lblOperation;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtDisplay;

    @FXML
    private Button num7;

    @FXML
    private Button num8;

    @FXML
    private Button num9;

    @FXML
    private Button btnDivision;

    @FXML
    private Button num4;

    @FXML
    private Button num5;

    @FXML
    private Button num6;

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button num1;

    @FXML
    private Button num2;

    @FXML
    private Button num3;

    @FXML
    private Button btnMinus;

    @FXML
    private Button clear;

    @FXML
    private Button num0;

    @FXML
    private Button btnPoint;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnEquals;

    private double value1=0;
    private double value2=0;
    private int operation =-1;
    private String lblView;

    @FXML
    void onButtonClicked(ActionEvent event) {
        if (txtDisplay.getText().length()>=10){
            txtDisplay.setFont(new Font(24));
        } if (txtDisplay.getText().length()>=20){
            txtDisplay.setFont(new Font(12));
        }
        if (event.getSource().equals(num1)){
            txtDisplay.setText(txtDisplay.getText()+"1");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num2)) {
            txtDisplay.setText(txtDisplay.getText() + "2");
            if (lblOperation==null){
            lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num3)) {
            txtDisplay.setText(txtDisplay.getText() + "3");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num4)) {
            txtDisplay.setText(txtDisplay.getText() + "4");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num5)) {
            txtDisplay.setText(txtDisplay.getText() + "5");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num6)) {
            txtDisplay.setText(txtDisplay.getText() + "6");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num7)) {
            txtDisplay.setText(txtDisplay.getText() + "7");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num8)) {
            txtDisplay.setText(txtDisplay.getText() + "8");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num9)) {
            txtDisplay.setText(txtDisplay.getText() + "9");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(btnPoint)) {
            txtDisplay.setText(txtDisplay.getText() + ".");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(num0)) {
            txtDisplay.setText(txtDisplay.getText() + "0");
            if (lblOperation==null){
                lblOperation.setText(txtDisplay.getText());
            }
        }else if (event.getSource().equals(clear)) {
            clearDisplay();

        }else if (event.getSource().equals(btnPlus)) {
           lblView=txtDisplay.getText()+" + ";
           lblOperation.setText(lblView);
            value1=Double.parseDouble(txtDisplay.getText());
            operation=1; //Addition
            txtDisplay.setText("");
            lblOperation.setText(lblView);
        }else if (event.getSource().equals(btnMinus)) {
            lblView=txtDisplay.getText()+" - ";
            lblOperation.setText(lblView);
            value1=Double.parseDouble(txtDisplay.getText());
            operation=2; //Addition
            txtDisplay.setText("");
            lblOperation.setText(lblView);
        }else if (event.getSource().equals(btnMultiplication)) {
            lblView=txtDisplay.getText()+" * ";
            lblOperation.setText(lblView);
            value1=Double.parseDouble(txtDisplay.getText());
            operation=3; //Addition
            txtDisplay.setText("");
            lblOperation.setText(lblView);
        }else if (event.getSource().equals(btnDivision)) {
            lblView=txtDisplay.getText()+" : ";
            lblOperation.setText(lblView);
            value1=Double.parseDouble(txtDisplay.getText());
            operation=4; //Addition
            txtDisplay.setText("");
            lblOperation.setText(lblView);
        }else if(event.getSource().equals(btnEquals)){
            lblOperation.setText(lblView + txtDisplay.getText());
            value2=Double.parseDouble(txtDisplay.getText());
            switch (operation){
                case 1:// " + "
                    double eq=value1+value2;
                    txtDisplay.setText(String.valueOf(eq));

                    break;

                case 2:// " - "
                    eq=value1-value2;
                    txtDisplay.setText(String.valueOf(eq));
                    break;

                case 3:// " * "
                    eq=value1*value2;
                    txtDisplay.setText(String.valueOf(eq));
                    break;

                case 4:// " / "
                    eq=0;
                    if(value2==0){
                        txtDisplay.setText(String.valueOf(eq));
                        break;
                    }
                    eq=value1/value2;
                    txtDisplay.setText(String.valueOf(eq));
                    break;
            }
        }


    }

    private void clearDisplay() {
        txtDisplay.clear();
        lblOperation.setText("");
        value1=0;
        value2=0;

    }

    @FXML
    void initialize() {

    }
}

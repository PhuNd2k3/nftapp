package com.application.controller;

import java.io.IOException;

import com.application.App;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Primary");
    }
}
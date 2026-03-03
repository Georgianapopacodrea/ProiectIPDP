package com.proiectipdp.chess;

import com.proiectipdp.chess.core.GameState;
import com.proiectipdp.chess.core.rules.RulesEngine;
import com.proiectipdp.chess.ui.BoardView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        GameState state = new GameState();
        RulesEngine engine = new RulesEngine();

        BoardView boardView = new BoardView(state, engine);

        StackPane root = new StackPane(boardView);
        Scene scene = new Scene(root);

        stage.setTitle("Proiect Sah IPDP");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TreeView;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML protected TreeView resourceTree;

    @FXML protected void onAddClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(Main.currentStage);
        loadResources(selectedFile);
    }

    @FXML protected void onDelClick() {
        System.out.println("del");
    }

    private void loadResources(File file) {
        System.out.println((file == null)? "null" : file.getAbsolutePath());
    }

}

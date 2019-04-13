package View;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private BorderPane borderpane;
    @FXML
    private VBox sidebar;
    @FXML
    private JFXButton tombol1;
    @FXML
    private JFXButton tombol2;
    @FXML
    private JFXButton tombol3;
	@FXML
    private JFXButton tombol4;
    @FXML
    private JFXButton tombol5;
    @FXML
    private JFXButton tombol6;
    @FXML
    private JFXButton tombola;

    @FXML
    private JFXButton tombolb;

    @FXML
    private JFXButton tombolc;

    @FXML
    private JFXButton tombold;

    @FXML
    private JFXButton tombole;

    @FXML
    private JFXButton tombolf;

    public void initialize(URL location, ResourceBundle resources){

    }

    public void handleMenu(ActionEvent actionEvent) throws IOException {
        //Buat array button dari children vbox
        Object[] objects = sidebar.getChildren().toArray();

        //Lakukan perulangan untuk merubah semua warna tombol menjadi warna default
        for (Object object : objects) {
            ((Node) object).setStyle("fx-background-color: white");
        }

        //Ubah warna yang diselect
        ((Node) actionEvent.getSource()).setStyle("-fx-background-color: lightblue");

        //Pengkondisian
        String index1, index;
        index="";
        index1="";
        if (actionEvent.getSource() == tombol1 || actionEvent.getSource() ==tombola)
            index = "Beranda";
        else if (actionEvent.getSource() == tombol2 || actionEvent.getSource() ==tombolb)
            index = "Transaksi";
        else if (actionEvent.getSource() == tombol3 || actionEvent.getSource() ==tombolc)
            index = "Nasabah";
		else if (actionEvent.getSource() == tombol4 || actionEvent.getSource() ==tombold)
            index = "Laporan";
		else if (actionEvent.getSource() == tombol5 || actionEvent.getSource() ==tombole)
            index = "About";

        //Tampilkan file fxml ke borderpane
        Parent root = FXMLLoader.load(getClass().getResource( index + ".fxml"));
        borderpane.setCenter(root);


    }
}

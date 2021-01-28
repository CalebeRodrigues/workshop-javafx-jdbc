package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

	
	@FXML
	private TextField txtId;
	@FXML
	private TextField txtName;
	@FXML
	private Label labelErroName;
	@FXML
	private Button btnSave;
	@FXML
	private Button btnCancel;
	
	
	@FXML
	public void onBtnSaveAction () {
		System.out.println("onBtnSaveAction()");
		System.out.println(txtName.getText());
	}
	
	@FXML
	public void onBtnCancelAction () {
		System.out.println("onBtnCancelAction()");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {


	}


	
}

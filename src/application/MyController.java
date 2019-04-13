package application;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class MyController {
	 @FXML
	 private Button prueba1;
	 @FXML
	 private DatePicker fecha1;
	 @FXML
	 private Label result;


 @FXML
 public void initialize() {
 // TODO (don't really need to do anything here).
 }
 public void compara() {
	 LocalDate ahora =  fecha1.getValue();
	 LocalDate primavera = LocalDate.of(ahora.getYear(), 3, 20);
	 LocalDate verano = LocalDate.of(ahora.getYear(), 6, 21);
	 LocalDate otoño = LocalDate.of(ahora.getYear(), 6, 21);
	 LocalDate invierno = LocalDate.of(ahora.getYear(), 6, 21);
	 String resultado = "";
	 
	 
	 
	
	if (ahora.compareTo(primavera)<1) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("Se aleja el invierno");
		alert.setContentText("se acerca la primavera");

		alert.showAndWait();
		
		
		
	}else if (ahora.compareTo(verano)<1) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("Se aleja la primavera");
		alert.setContentText("se acerca el verano");

		alert.showAndWait();
		
		
	}else if (ahora.compareTo(otoño)<1) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("Se aleja el verano");
		alert.setContentText("se acerca el otoño");

		alert.showAndWait();
		
		
	}else if (ahora.compareTo(invierno)<1) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("Se aleja el otoño");
		alert.setContentText("se acerca el invierno");

		alert.showAndWait();
		
		
	}else  {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Dialog");
		alert.setHeaderText("Ha habido un error");
		alert.setContentText("Fecha no valida");

		alert.showAndWait();
	}

	 
 }
 
}


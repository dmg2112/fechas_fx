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
		resultado = "se acerca la primavera";
		
		
	}else if (ahora.compareTo(verano)<1) {
		resultado= "se acerca el verano";
		
		
	}else if (ahora.compareTo(otoño)<1) {
		resultado= "se acerca el otoño";
		
		
	}else if (ahora.compareTo(invierno)<1) {
		resultado = "se acerca el invierno";
		
		
	}else  {
		resultado = "fecha no valida";
	}
	result.setText(resultado);

	 
 }
 
}


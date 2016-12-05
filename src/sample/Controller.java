package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller{
    @FXML
    private Text output;
    
    private String operator = "";
    private long number1 = 0;
    private boolean start = true;
    
    private Model model = new Model();
    
    @FXML
    private void Numbers(ActionEvent event){
        if(start) {
            output.setText("");
            start = false;
        }
        
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText()+value);
    }
    
    @FXML
    private void Operators(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if("root".equals(value) || "x^2".equals(value) || "sin".equals(value) || "cos".equals(value)){
        operator = value;
        number1 = (long) Double.parseDouble(output.getText());
        output.setText(String.valueOf(model.Calculate2(number1,operator)));
            operator = value;
            start = true;
        }
        else if("AC".equals(value)){
            operator = "";
            output.setText("");
        }
        else{
        if(!"=".equals(value)){
            if(!operator.isEmpty())
                return;
            operator = value;
            number1 = (long) Double.parseDouble(output.getText());
            output.setText("");
        }
        else{
            if(operator.isEmpty())
                return;
            
            output.setText(String.valueOf(model.Calculate(number1,Double.parseDouble(output.getText()),operator)));
            operator = "";
            start = true;
        }
      }
    }
}

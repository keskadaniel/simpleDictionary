import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class FXController {


    @Override
    public String toString() {
        return String.valueOf(polishText);
    }

    public TextField polishText;
    public TextField gagaText;
    public Button buttonTranslate;

    Map<String, String> dictionary = new HashMap<String, String>();


    public void translate(ActionEvent actionEvent) {


        dictionary.put("jeść", "amu");
        dictionary.put("pić", "ssss");
        dictionary.put("siku", "sisi");
        dictionary.put("kupe", "aaaaaa!!!");
        dictionary.put("daj", "daaaaaa!!!");

        if(dictionary.containsKey(polishText.getText())) {
            gagaText.setText(dictionary.get(polishText.getText()));
        }else {gagaText.setText("No such word here!");}
    }


    public void addNew(ActionEvent actionEvent) {

        dictionary.put(polishText.getText(), gagaText.getText());
        polishText.clear();
        gagaText.clear();


    }
}

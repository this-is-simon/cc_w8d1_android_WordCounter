package wordcounter.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    private EditText inputParagraph;
    private TextView outputWordcountNumber;
    private Button button;
    private WordCounter wordCounter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        inputParagraph = findViewById(R.id.inputParagraphID);
        outputWordcountNumber = findViewById( R.id.outputWordcountNumberID);
        button = findViewById(R.id.buttonID);
    }

    public void onButtonClicked(View button){

        String paragraph = inputParagraph.getText().toString();
        int wordsCounted = wordCounter1.countWords(paragraph);
        outputWordcountNumber.setText(wordsCounted);
    }


}

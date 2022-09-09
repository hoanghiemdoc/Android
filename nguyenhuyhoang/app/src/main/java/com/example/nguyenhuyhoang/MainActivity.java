package com.example.nguyenhuyhoang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText txt_username,txt_email,txt_content;
    boolean valid = true;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_username = findViewById(R.id.txt_username);
        txt_email = findViewById(R.id.txt_email);
        txt_content = findViewById(R.id.txt_content);
        Spinner spinner = findViewById(R.id.label_spinner);
        btnsave = findViewById(R.id.send);
        btnsave.setOnClickListener(view -> {
            checkField(txt_username);
            checkField(txt_content);
            checkField(txt_email);
            saveData();

        });
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    private void saveData() {

    }

    public boolean checkField(EditText textField){
        if (textField.getText().toString().isEmpty()) {
            textField.setError("Đã xảy ra lỗi !");
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
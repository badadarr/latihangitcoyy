package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt_Length;
    private EditText edt_Width;
    private EditText edt_Height;
    private Button btn_Calculate;
    private TextView tv_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Length = findViewById(R.id.edt_length);
        edt_Width = findViewById(R.id.edt_width);
        edt_Height = findViewById(R.id.edt_height);
        btn_Calculate = findViewById(R.id.btn_calculate);
        tv_Result = findViewById(R.id.tv_result);


        btn_Calculate.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_calculate) {
            String inputLength = edt_Length.getText().toString().trim();
            String inputWidth = edt_Width.getText().toString().trim();
            String inputHeight = edt_Height.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputLength)) {
                isEmptyFields = true;
                edt_Length.setError("Field Ini Tidak Boleh Kosong");
            }

            Double length = toDouble(inputLength);
            Double width = toDouble(inputWidth);
            Double height = toDouble(inputHeight);

            if (length == null) {
                isInvalidDouble = true;
                edt_Length.setError("Field Ini Harus Berupa Nomor Yang Valid");

            }

            if (width == null) {
                isInvalidDouble = true;
                edt_Width.setError("Field Ini Harus Berupa Nomor Yang Valid");
            }

            if (height == null) {
                isInvalidDouble = true;
                edt_Height.setError("Field Ini Harus Berupa Nomor Yang Valid");

            }

            if (!isEmptyFields && !isInvalidDouble) {

                double volume = length * width * height;

                tv_Result.setText(String.valueOf(volume));


            }
        }
    }

    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;

        }
    }

    private static final String STATE_RESULT = "state_result";


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_RESULT, tv_Result.getText().toString());
    }

}

//@Override
// protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ...
//
//@Override
//protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        if (savedInstanceState != null) {
//        String result = savedInstanceState.getString(STATE_RESULT);
//        tvResult.setText(result);
//        }
//        }
//}
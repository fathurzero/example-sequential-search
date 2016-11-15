package com.okedroid.latihan2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Fathurrahman (okedroid.com)
    int numbers[] = {
                    12, 13, 2, 33, 23,
                    31, 22, 6, 87, 16 };
    //inisialisasi list var array numbers
    int key;
    boolean found = false;
    TextView textView ,textView2;
    EditText editText;
    String data;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text_view);
        textView2 = (TextView)findViewById(R.id.textView2);
        editText = (EditText)findViewById(R.id.edit_text);
        textView2.setText(" Data yang Tersedia:\n [ 12, 13, 2, 33, 23, 31, 22, 6, 87, 16 ]");
        textView2.setTextColor(Color.BLUE);
        //Menampilkan text data yang tersedia


        getSupportActionBar().setTitle("Sequential Search");
        getSupportActionBar().setSubtitle("okedroid.com");

    }



    public void cariData(View view) {

        try {
            data =editText.getText().toString();
            /*
            Mengambil nilai/value dari inputan editext ke dalam
            tipe data string
               */

            key =Integer.parseInt(data);
            /*
            Mengambil nilai value string  dari inputan editext ke dalam
            tipe data integer
               */
            for (i=0; i<numbers.length;  i++) {
                   /*
                Melakukan looping dari indext i berdasarkan panjang/besar nilai di var numbers
               */

                if (key == numbers[i]) {
                    found = true;
                    break;

                    /*
                    Jika nilai key sama dengan array numbers
                    maka found menjadi true
                    dan melakukan break

                     */

                }

                else if (key != numbers[i]){
                    found = false;

                             /*
                    Jika nilai key tidak sama dengan array numbers
                    maka found menjadi false

                     */
                }


            }

            if (found == true ){
                textView.setText("Data : "+key+" Index : "+i);
                textView.setTextColor(Color.GREEN);

                /*
                Jika nilai found true
                 */


            }
            else {

                textView.setText("Data Tidak \nDitemukan");
                textView.setTextColor(Color.RED);
                   /*
                Jika nilai found false
                 */

            }

        }
      catch (NumberFormatException ex){

          Toast.makeText(this, "Input Data Kosong", Toast.LENGTH_SHORT).show();
          /*
          Exception ketika user  tidak menginput data atau data kosong
           */
      }



    }
}

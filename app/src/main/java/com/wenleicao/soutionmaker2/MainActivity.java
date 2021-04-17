package com.wenleicao.soutionmaker2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_SolutionVolumn, tv_Volumn_Unit, tv_add_chemical_by_search;
    Button  btn_Search, btn_Upgrade;
    EditText et_Search_Text, et_Volumn;
    ListView lv_chemical;
    ImageButton imb_add;
    SQLiteHelper sqlitehelper;
    List<ChemicalDataModel> cdm;
    ArrayAdapter ChemicalArrayAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define control
        btn_Search = findViewById(R.id.btn_Search);
        btn_Upgrade = findViewById(R.id.btn_upgrade);
        et_Search_Text = findViewById(R.id.et_Search_Text);
        et_Volumn = findViewById(R.id.et_Volumn);
        imb_add = findViewById(R.id.imb_add);
        lv_chemical = findViewById(R.id.lv_chemical);

        sqlitehelper = new SQLiteHelper(MainActivity.this );
        ShowChemicalInListview();
        //define listener
        btn_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowChemicalInListview();


                /*
                try {
                    //ChemicalDataModel cdm  = new ChemicalDataModel(-1, "sigma", "potassium chloride", "KCL", "K123", 68, "user" );
                    Toast.makeText(MainActivity.this,  cdm.toString(), Toast.LENGTH_SHORT).show();}
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,  "Error Created", Toast.LENGTH_SHORT).show();}
                */

                }
            }
        );

       /*
        btn_Upgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlitehelper.onUpgrade;
            }
        });
        */

        //img button listener
        imb_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteHelper sqlitehelper = new SQLiteHelper(MainActivity.this );
                ChemicalDataModel cdm;
                try {
                    cdm = new ChemicalDataModel(1, "sigma", "sodium chloride", "NaCL", "N123", 55.5, "user");

                }
                catch (Exception e) {
                    cdm = new ChemicalDataModel(-1, "", "error", "", "", 0, "user");
                }
                ShowChemicalInListview();
                //boolean success = sqlitehelper.addOne(cdm);
                //Toast.makeText(MainActivity.this,  "success " + success, Toast.LENGTH_SHORT).show();
            }
        });

        lv_chemical.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ChemicalDataModel cdm = (ChemicalDataModel) adapterView.getItemAtPosition(i);
                sqlitehelper.deleteOne(cdm);
                ShowChemicalInListview();
            }
        });

    }

    private void ShowChemicalInListview() {
        cdm = sqlitehelper.selectWithParam(et_Search_Text.getText().toString(), et_Search_Text.getText().toString(),et_Search_Text.getText().toString());
        ChemicalArrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,cdm);
        lv_chemical.setAdapter(ChemicalArrayAdapter);
    }


    /** Called when the user taps the Send button */
    public void searchChemical(View view) {
        // Do something in response to button
    }
}
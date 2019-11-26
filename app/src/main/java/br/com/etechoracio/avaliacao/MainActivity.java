package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editNum1;
    EditText editNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);

        setContentView(R.layout.activity_main);



    }

    public void onProcessar (View view){
        projetoApiService service = new Retrofit.Builder().baseUrl("http://quiteriaetec.somee.com/api/Projetos/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(projetoApiService.class);

        Call<String> call = service.cubo (projetoApiService);
    }



}

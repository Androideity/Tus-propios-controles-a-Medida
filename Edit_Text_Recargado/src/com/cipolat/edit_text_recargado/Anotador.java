package com.cipolat.edit_text_recargado;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

public class Anotador extends Activity {

	private EditText Anotador;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotador);
        //Referencia a nuestro campo de texto.
        Anotador=(EditText) findViewById(R.id.edit_text_modificado);
    }

    
}

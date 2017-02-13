package games.lancelot.pokemonapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import games.lancelot.pokemonapi.entity.PokemonEntity;
import games.lancelot.pokemonapi.service.apiImplementacion;
import games.lancelot.pokemonapi.R;
import games.lancelot.pokemonapi.entity.PokemonEntity;
import games.lancelot.pokemonapi.service.apiImplementacion;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {


    EditText id = (EditText)findViewById(R.id.etId);
    EditText contra = (EditText)findViewById(R.id.etContra);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiImplementacion.getService().getPokemon(new Callback<ArrayList<PokemonEntity>>() {
            @Override
            public void success(ArrayList<PokemonEntity> lista, Response response)
            {

              /*  if( (  (id.getText().toString().equals("Bulbasaur"))  &&  (contra.getText().toString().equals("Planta"))  )
                        ||  ((id.getText().toString().equals("Bulbasaur"))  &&  (contra.getText().toString().equals("Planta")))
                        ||  ((id.getText().toString().equals("Bulbasaur"))  &&  (contra.getText().toString().equals("Planta")))  )
                {
                    Intent nuevoL = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(nuevoL);
                }*/

                Toast.makeText(getApplicationContext(), "hola", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError retrofitError)
            {
                Log.i("respuesta", "algo salio mal :C");
            }
        });

        /*apiImplementacion.getService().getPokemon(new Callback<ArrayList<PokemonEntity>>() {
            @Override
            public void success(ArrayList<PokemonEntity> lista, Response response)
            {
                String cuenta1;
                String contra1;
                String cuenta2;
                String contra2;
                String cuenta3;
                String contra3;

                for(PokemonEntity p: lista) //de no funcionar, simplemente por variable
                {
                    cuenta1 = p.getNombre();
                    contra1 = p.getTipo();

                    if(cuenta1 != null && contra1 != null)
                    {
                        cuenta2 = p.getNombre();
                        contra2 = p.getTipo();

                        if(cuenta2 != null && contra2 != null)
                        {
                            cuenta3 = p.getNombre();
                            contra3 = p.getTipo();
                        }
                    }


                }

                if(  ( (id.getText().toString().equals(cuenta1)) && ((contra.getText().toString().equals(contra1))  )||
                        ( (id.getText().toString().equals(cuenta1)) && (contra.getText().toString().equals(contra1))  )||
                        ( (id.getText().toString().equals(cuenta1)) && (contra.getText().toString().equals(contra1)) )  )
                {
                    Intent nuevoL = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(nuevoL);
                }
            }

            @Override
            public void failure(RetrofitError retrofitError)
            {
                Log.i("respuesta", "algo salio mal :C");

            }
        });*/
    }


}
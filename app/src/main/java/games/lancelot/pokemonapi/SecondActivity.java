package games.lancelot.pokemonapi;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import games.lancelot.pokemonapi.entity.PokemonEntity;
import games.lancelot.pokemonapi.service.apiImplementacion;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Aldo on 10/02/2017.
 */
public class SecondActivity extends AppCompatActivity
{
    ListView lvPokemones;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundolayout);

        lvPokemones = (ListView)findViewById(R.id.lvPokemons);

        apiImplementacion.getService().getPokemon(new Callback<ArrayList<PokemonEntity>>() {
            @Override
            public void success(ArrayList<PokemonEntity> pokemonEntities, Response response)
            {
                adapterPokemons adaptador = new adapterPokemons(SecondActivity.this, pokemonEntities);
                lvPokemones.setAdapter(adaptador);///falta manifest
            }

            @Override
            public void failure(RetrofitError retrofitError)
            {
                Toast.makeText(getApplicationContext(), "No funciona ", Toast.LENGTH_SHORT).show();
            }
        });

    }



    private class adapterPokemons extends ArrayAdapter<PokemonEntity>
    {
        private List<PokemonEntity> listaPokemon;

        public adapterPokemons(Context contexto, List<PokemonEntity> poke)
        {
            super(contexto,R.layout.listitem,poke);
            listaPokemon = poke;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            View item = inflater.inflate(R.layout.listitem, null);


            TextView tvTexto = (TextView)item.findViewById(R.id.tvTitulo);/////////
            tvTexto.setText(listaPokemon.get(position).getNombre());

            TextView tvDescrip = (TextView)item.findViewById(R.id.tvDescripcion);
            tvDescrip.setText(listaPokemon.get(position).getTipo());

            return item;
        }
    }
}

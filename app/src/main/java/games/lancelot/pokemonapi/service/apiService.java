package games.lancelot.pokemonapi.service;

import java.util.ArrayList;

import games.lancelot.pokemonapi.entity.PokemonEntity;
import games.lancelot.pokemonapi.entity.PokemonEntity;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Aldo on 09/02/2017.
 */
public interface apiService
{
    @GET("/lista_pokemons.php")

    void getPokemon(Callback<ArrayList<PokemonEntity>> callback);


}

package games.lancelot.pokemonapi.service;

import retrofit.RestAdapter;

/**
 * Created by Aldo on 09/02/2017.
 */
public class apiImplementacion
{
    private static RestAdapter restAdapter = new RestAdapter.Builder().
            setEndpoint("http://victorcasass.com/api").build();

    public static apiService getService()
    {
        return restAdapter.create(apiService. class );
    }
}

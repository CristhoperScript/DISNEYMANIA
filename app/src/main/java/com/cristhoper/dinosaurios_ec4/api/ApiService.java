package com.cristhoper.dinosaurios_ec4.api;

import com.cristhoper.dinosaurios_ec4.models.ItemRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("character/")
    Call<ItemRespuesta> obtenerListaItem();
}

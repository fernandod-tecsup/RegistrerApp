package com.diaz.registrerapp.servicios;

import com.diaz.registrerapp.models.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    String API_BASE_URL = "http://10.0.2.2:8080";
    @GET("/productos")
    Call<List<Producto>> getProductos();

}

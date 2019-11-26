package br.com.etechoracio.avaliacao.service;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface projetoApiService {


    @POST(".")
    Call<String> cubo (@Body cubo cubo);
        }

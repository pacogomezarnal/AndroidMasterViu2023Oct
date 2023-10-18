package es.repositoriocompartido.canalesyoutube

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getCanalesYoutube(@Url url:String): Response<CanalResponse>
}
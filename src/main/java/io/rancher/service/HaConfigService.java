package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.HaConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HaConfigService {

  @GET("haConfig")
  Call<TypeCollection<HaConfig>> list();

  @GET("haConfig")
  Call<TypeCollection<HaConfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("haConfig/{id}")
  Call<HaConfig> get(@Path("id") String id);

  @POST("haConfig")
  Call<HaConfig> create(@Body HaConfig haConfig);

  @PUT("haConfig/{id}")
  Call<HaConfig> update(@Path("id") String id, @Body HaConfig haConfig);

  @DELETE("haConfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}

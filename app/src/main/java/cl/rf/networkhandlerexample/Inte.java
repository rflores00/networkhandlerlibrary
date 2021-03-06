package cl.rf.networkhandlerexample;

import androidx.lifecycle.LiveData;

import cl.rf.annotation.Endpoints;
import cl.rf.networkhandler.core.ApiResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Endpoints(baseUrl = "https://api.agify.io/")
public interface Inte {

    @GET("/isa")
    LiveData<ApiResponse<SimpleResponse>> getText(@Query("name") String nombre);

    @GET("/")
    LiveData<ApiResponse<SimpleResponse>> getText2(@Query("name") String nombre);
}

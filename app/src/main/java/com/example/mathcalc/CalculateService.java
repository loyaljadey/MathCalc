package com.example.mathcalc;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CalculateService {

    @GET ("{operation}/{expression}")
    Call<CalculateResponse> calculateMath(
            @Path("operation") String operation,
            @Path("expression") String expression);

    @GET ("{operation}/{expression}")
    Call<CalculateResponseZeroes> calculateZeros(
            @Path("operation") String operation,
            @Path("expression") String expression);
}

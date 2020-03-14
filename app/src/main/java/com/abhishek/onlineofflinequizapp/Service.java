package com.abhishek.onlineofflinequizapp;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 4/30/18.
 */

public interface Service {


    @GET("b2b/api/v1/user/get/subuser/3")
    Call<List<Entity_model>> getQuestions2();

}

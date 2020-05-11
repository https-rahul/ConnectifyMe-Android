package services;

import application.rahul.connectifyme.activity.LoginActivity;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserInterface {

    @POST("login")
    Call<Integer> signin(@Body LoginActivity.UserInfo userInfo);
}

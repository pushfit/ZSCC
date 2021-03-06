package com.zspt.app.modulelogin.api;

import com.zspt.app.library_common.base.model.HttpResult;
import com.zspt.app.modulelogin.model.RegisterResult;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by yuequan on 2017/10/17.
 */

public interface ISignUpApi {
    @FormUrlEncoded
    @POST("")
    Observable<HttpResult<RegisterResult>> onResigter(@Field("account") String account, @Field("password") String password);

}

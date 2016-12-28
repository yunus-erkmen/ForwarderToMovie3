package com.akay4gmail.mehmetcan.forwardertomovie.base;

import android.content.Context;

import com.akay4gmail.mehmetcan.forwardertomovie.Constant;
import com.akay4gmail.mehmetcan.forwardertomovie.restApi.RestApi;
import com.akay4gmail.mehmetcan.forwardertomovie.restApi.RestApiClient;

/**
 * Created by mehme on 2.08.2016.
 */
public class BaseManager {
    protected RestApi getRestApiClient(Context context) {

        RestApiClient restApiClient= new RestApiClient(Constant.SERVICE_URL);
        return restApiClient.getmRestApi();
    }
}

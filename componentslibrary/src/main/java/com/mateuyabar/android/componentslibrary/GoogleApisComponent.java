package com.mateuyabar.android.componentslibrary;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.mateuyabar.android.cleanbase.BaseComponent;


public class GoogleApisComponent extends BaseComponent implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener  {
    GoogleApiClient googleApiClient;
    boolean connected = false;

    // CHECK https://developers.google.com/android/guides/api-client#Starting and fix things


    public GoogleApisComponent(Context context) {
        super(context);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        googleApiClient = new GoogleApiClient.Builder(getContext())
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();
        //if (!mResolvingError) {  // more about this later
        googleApiClient.connect();
        //}
    }

    @Override
    public void onStop() {
        googleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onConnected(Bundle bundle) {
        connected = true;
    }

    @Override
    public void onConnectionSuspended(int i) {
        connected = false;
        //TODO
    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        connected = false;
       //TODO
    }

    public boolean isConnected() {
        return connected;
    }

    public GoogleApiClient getGoogleApiClient() {
        return googleApiClient;
    }
}

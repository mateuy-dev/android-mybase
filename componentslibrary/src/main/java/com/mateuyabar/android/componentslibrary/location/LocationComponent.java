package com.mateuyabar.android.componentslibrary.location;


import android.content.Context;
import android.location.Location;

import com.google.android.gms.location.LocationServices;
import com.mateuyabar.android.componentslibrary.GoogleApisComponent;

public class LocationComponent extends GoogleApisComponent {

    public LocationComponent(Context context) {
        super(context);
    }



    /**
     * This should return a Future or a PillowResult.
     * Also should inlcude a max error
     * @return
     */
    public Location getCurrentLocation(){
        if(isConnected()) {
            Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(getGoogleApiClient());
            return lastLocation;
        } else {
            return null;
        }
    }


}

package com.kwenziwa.flightmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback  {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(getApplicationContext(), getString(R.string.flightmap_access_token));
        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this::onMapReady);
    }

    @Override
    public void onMapReady(MapboxMap mapboxMap) {

         // mapboxMap.setStyle(new Style.Builder().fromUri("https://maps.flightmap.io/styles//style-dark.json"));
       // Dark Theme:https://maps.flightmap.io/styles//style-dark.json
        // LightTheme:https://maps.flightmap.io/styles/style-bright.json
        mapboxMap.getUiSettings().setLogoMargins(0,0,0,0);
        //to set gravity right of attribute
        mapboxMap.getUiSettings().setAttributionGravity(Gravity.RIGHT|Gravity.END|Gravity.BOTTOM);

//        mapboxMap.setStyle(
//                new Style.Builder().fromUri(Style.DARK)
//                new Style.Builder().fromUri(Style.LIGHT) for Light  theme
//
//
//        );
   }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

}
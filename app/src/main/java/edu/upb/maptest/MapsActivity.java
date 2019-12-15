package edu.upb.maptest;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng mrpizza1 = new LatLng(-16.526209, -68.107822);
        mMap.addMarker(new MarkerOptions().position(mrpizza1).title("Mr. Pizza 1"));
        LatLng mrpizza2 = new LatLng(-16.524656, -68.086151);
        mMap.addMarker(new MarkerOptions().position(mrpizza2).title("Mr. Pizza 2"));
        LatLng mrpizza3 = new LatLng(-16.528807, -68.071133);
        mMap.addMarker(new MarkerOptions().position(mrpizza3).title("Mr. Pizza 3"));
        LatLng cozzolisi1 = new LatLng(-16.510325, -68.127930);
        mMap.addMarker(new MarkerOptions().position(cozzolisi1).title("Cozzolisi 1"));
        LatLng cozzolisi2 = new LatLng(-16.532250, -68.086801);
        mMap.addMarker(new MarkerOptions().position(cozzolisi2).title("Cozzolisi 2"));
        LatLng cozzolisi3 = new LatLng(-16.543362, -68.079489);
        mMap.addMarker(new MarkerOptions().position(cozzolisi3).title("Cozzolisi 3"));
        LatLng muela = new LatLng(-16.545006, -68.079183);
        mMap.addMarker(new MarkerOptions().position(muela).title("Muela del diablo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(muela,12));
    }
}

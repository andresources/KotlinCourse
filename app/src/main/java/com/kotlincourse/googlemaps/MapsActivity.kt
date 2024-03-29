package com.kotlincourse.googlemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.kotlincourse.R
import com.kotlincourse.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val hyd = LatLng(17.452938, 78.380981)
        var mark = MarkerOptions()
        mark.position(hyd).title("Marker in Hyderabad")

        mMap.addMarker(mark)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hyd, 10f))

        mMap.setOnMapClickListener({

            var lat = it.latitude
            var lng = it.longitude
            Toast.makeText(this@MapsActivity,"Selected Lat: $lat, Lng : $lng",Toast.LENGTH_SHORT).show()
            mMap.clear()

            var mark = MarkerOptions()
            mark.position(it)
            mark.title("Hyderbad Loc")

            mMap.addMarker(mark)

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(it, 10f));
        })

    }
}
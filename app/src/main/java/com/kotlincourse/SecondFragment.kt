package com.kotlincourse

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.kotlincourse.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    private lateinit var view: View
    private lateinit var secondButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(R.layout.fragment_second, container, false)
        secondButton = view.findViewById(R.id.secondButton)
        secondButton.setOnClickListener {
            Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();
        }
        return view
    }
    override fun onStart() {
        super.onStart()
        Log.i("zzz","SecondFragment - onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("zzz","SecondFragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("zzz","SecondFragment - onPause")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("zzz","SecondFragment - onDestroy")
    }
}
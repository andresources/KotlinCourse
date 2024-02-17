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
import com.kotlincourse.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */


class FirstFragment : Fragment() {
    private lateinit var view: View
    private lateinit var firstButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(R.layout.fragment_first, container, false)
        firstButton = view.findViewById(R.id.firstButton)

        firstButton.setOnClickListener {
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
        }
        return view
    }
    override fun onStart() {
        super.onStart()
        Log.i("zzz","FirstFragment - onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("zzz","FirstFragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("zzz","FirstFragment - onPause")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("zzz","FirstFragment - onDestroy")
    }
}
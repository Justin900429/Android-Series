package com.example.fragement

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Fragment: Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        // Message printed in log
        Log.i("Fragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Message printed in log
        Log.i("Fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_layout, container, false)

        // Message printed in log
        Log.i("Fragment", "onCreateView")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // Message printed in log
        Log.i("Fragment", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        // Message printed in log
        Log.i("Fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        // Message printed in log
        Log.i("Fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        // Message printed in log
        Log.i("Fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        // Message printed in log
        Log.i("Fragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Message printed in log
        Log.i("Fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Message printed in log
        Log.i("Fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        // Message printed in log
        Log.i("Fragment", "onDetach")
    }
}
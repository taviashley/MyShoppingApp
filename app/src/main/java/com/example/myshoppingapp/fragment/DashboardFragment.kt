package com.example.myshoppingapp.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myshoppingapp.MainActivity
import com.example.myshoppingapp.databinding.FragmentDashboardBinding

private lateinit var mainActivity: MainActivity

class DashboardFragment : Fragment() {
    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainActivity = activity as MainActivity
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
        
    }

}
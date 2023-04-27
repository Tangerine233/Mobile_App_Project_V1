package com.example.mobile_app_project_v1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val root: View = binding.root


        binding.StartHere.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_nav_home_to_nav_gallery)
        }
        binding.LearningModules.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.action_nav_home_to_nav_slideshow)
            view.findNavController().navigate(R.id.action_nav_home_to_learning_modules)
        }
//
//        setHasOptionsMenu(true)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
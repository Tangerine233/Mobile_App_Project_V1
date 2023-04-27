package com.example.mobile_app_project_v1.ui.learning_modules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mobile_app_project_v1.databinding.FragmentLearningModulesBinding

class LearningModulesFragment : Fragment()  {

    private var _binding: FragmentLearningModulesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val LearningModulesViewModelModules =
            ViewModelProvider(this).get(LearningModulesViewModel::class.java)

        _binding = FragmentLearningModulesBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
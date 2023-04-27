package com.example.mobile_app_project_v1.ui.learning_modules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.mobile_app_project_v1.MainActivity
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FragmentLearningModulesBinding

class LearningModulesFragment : Fragment()   {

    private var _binding: FragmentLearningModulesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val LearningModulesViewModel =
            ViewModelProvider(this).get(LearningModulesViewModel::class.java)

        _binding = FragmentLearningModulesBinding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.l1.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 1
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l2.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 2
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l3.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 3
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l4.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 4
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l5.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 5
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l6.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 6
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l7.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 7
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l8.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 8
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l9.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 9
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l10.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 10
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l11.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 11
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l12.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 12
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }
        binding.l13.setOnClickListener() {view : View ->
            MainActivity.submoduleNumber = 13
            view.findNavController().navigate(R.id.action_nav_learning_modules_to_submodule)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
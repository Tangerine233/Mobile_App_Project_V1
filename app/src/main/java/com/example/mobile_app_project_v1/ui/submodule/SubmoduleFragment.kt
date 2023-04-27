package com.example.mobile_app_project_v1.ui.submodule

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.mobile_app_project_v1.MainActivity
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FragmentLearningModulesBinding
import com.example.mobile_app_project_v1.databinding.FragmentSubmoduleBinding
import com.example.mobile_app_project_v1.ui.learning_modules.LearningModulesViewModel

class SubmoduleFragment : Fragment()  {

    private var _binding: FragmentSubmoduleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    val labLinks = Array(13){i -> "https://developer.android.com/courses/pathways/android-development-with-kotlin-".plus(i.toString())}


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val SubmoduleFragment =
            ViewModelProvider(this).get(SubmoduleViewModel::class.java)

        _binding = FragmentSubmoduleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.slide.setOnClickListener {
            //TODO open slide base on the chosed submodule
        }
        binding.lab.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(labLinks[MainActivity.submoduleNumber]))
            startActivity(i)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
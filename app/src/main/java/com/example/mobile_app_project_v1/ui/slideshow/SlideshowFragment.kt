package com.example.mobile_app_project_v1.ui.slideshow

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
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root



        binding.mod1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-1"))
            startActivity(i)
        }
        binding.mod2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-2"))
            startActivity(i)
        }

        binding.mod3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-3"))
            startActivity(i)
        }

        binding.mod4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-4"))
            startActivity(i)
        }

        binding.mod5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-5"))
            startActivity(i)
        }
        binding.mod6.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-6"))
            startActivity(i)
        }

        binding.mod7.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-7"))
            startActivity(i)
        }
        binding.mod8.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-8"))
            startActivity(i)
        }
        binding.mod9.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-9"))
            startActivity(i)
        }
        binding.mod10.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-10"))
            startActivity(i)
        }
        binding.mod11.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-11"))
            startActivity(i)
        }
        binding.mod12.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-12"))
            startActivity(i)
        }
        binding.mod13.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/courses/pathways/android-development-with-kotlin-13"))
            startActivity(i)
        }





        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
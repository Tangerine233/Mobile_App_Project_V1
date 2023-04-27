package com.example.mobile_app_project_v1.pages

import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FrameBinding
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


class SyllabusFragment : Fragment(R.layout.frame) {
    //private var _binding: ActivityMainBinding = null
    private lateinit var binding: FrameBinding
    private val STORAGE_PERMISSION_CODE: Int = 1000

    // This property is only valid between onCreateView and
    // onDestroyView.
    //private val binding get() = _binding!!
        override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FrameBinding.inflate(inflater, container, false)

        val textView = binding.textView
        textView.text = getString(R.string.Syllabus)

        //These were used before viewBinding
        //val v = inflater.inflate(R.layout.frame, container, false)
        //val pdf = v.findViewById<PDFView>(R.id.pdfview)

        val pdf = binding.pdfview
        pdf.fromAsset("CS_4322_2_Sp_23_Syllabus.pdf").load()

        val buttonDownload = binding.buttonDownload
        buttonDownload.setOnClickListener {
            // Handle button click event

            downloadPdfFromAssets()
        }
        return binding.root
    }
    private fun downloadPdfFromAssets() {
        // Get the AssetManager to access the assets folder
        val assetManager = requireContext().assets

        try {
            // Open the PDF file from the assets folder
            val inputStream = assetManager.open("CS_4322_2_Sp_23_Syllabus.pdf")

            // Create a ByteArray to read the PDF data
            val byteArray = ByteArray(inputStream.available())
            inputStream.read(byteArray)

            // Save the PDF file to external storage or other desired location
            // Example: Save to external storage
            val file = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "CS_4322_2_Sp_23_Syllabus.pdf")
            val outputStream = FileOutputStream(file)
            outputStream.write(byteArray)

            // Close the input and output streams
            outputStream.flush()
            inputStream.close()
            outputStream.close()

            // Show a toast indicating the PDF download is complete
            Toast.makeText(requireContext(), "PDF downloaded successfully", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
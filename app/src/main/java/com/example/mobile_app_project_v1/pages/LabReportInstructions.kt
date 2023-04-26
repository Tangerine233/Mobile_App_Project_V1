package com.example.mobile_app_project_v1.pages

import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FragmentGalleryBinding
import com.example.mobile_app_project_v1.databinding.FrameBinding
import com.example.mobile_app_project_v1.databinding.LabReportInstructionsBinding
import com.github.barteksc.pdfviewer.PDFView
import org.apache.poi.xwpf.usermodel.XWPFDocument
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

class LabReportInstructions : Fragment() {
    //private var _binding: ActivityMainBinding = null
    private lateinit var binding: FrameBinding

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
        textView.text = getString(R.string.LabReportInstructions)

        //These were used before viewBinding
        //val v = inflater.inflate(R.layout.frame, container, false)
        //val pdf = v.findViewById<PDFView>(R.id.pdfview)

        val pdf = binding.pdfview
        pdf.fromAsset("Lab Report Instruction.pdf").load()

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
            val inputStream = assetManager.open("Lab Report Instruction.pdf")

            // Create a ByteArray to read the PDF data
            val byteArray = ByteArray(inputStream.available())
            inputStream.read(byteArray)

            // Save the PDF file to external storage or other desired location
            // Example: Save to external storage
            val file = File(Environment.getExternalStorageDirectory(), "Lab Report Instruction.pdf")
            val outputStream = FileOutputStream(file)
            outputStream.write(byteArray)

            // Close the input and output streams
            inputStream.close()
            outputStream.close()

            // Show a toast indicating the PDF download is complete
            Toast.makeText(requireContext(), "Word document downloaded successfully", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
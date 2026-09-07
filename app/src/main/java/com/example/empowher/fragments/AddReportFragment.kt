package com.example.empowher.fragments

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.empowher.R
import com.example.empowher.databinding.FragmentAddReportBinding
import java.util.*

class AddReportFragment : Fragment() {

    private var _binding: FragmentAddReportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddReportBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupIncidentTypeDropdown()
        setupDatePicker()

        binding.ivBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        binding.btnSubmit.setOnClickListener {
            // In a real app, this would send data to Firestore
            Toast.makeText(context, "Report Submitted Securely", Toast.LENGTH_LONG).show()
            parentFragmentManager.popBackStack()
        }
    }

    private fun setupIncidentTypeDropdown() {
        val types = arrayOf(
            "Cyber Harassment",
            "Street Harassment",
            "Workplace Harassment",
            "Domestic Violence",
            "Stalking",
            "Other"
        )
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, types)
        binding.acIncidentType.setAdapter(adapter)
    }

    private fun setupDatePicker() {
        binding.etDate.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(
                requireContext(),
                { _, selectedYear, selectedMonth, selectedDay ->
                    val date = "${selectedMonth + 1}/$selectedDay/$selectedYear"
                    binding.etDate.setText(date)
                },
                year, month, day
            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

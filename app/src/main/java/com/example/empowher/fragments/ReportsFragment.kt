package com.example.empowher.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.empowher.R
import com.example.empowher.adapters.ReportAdapter
import com.example.empowher.databinding.FragmentReportsBinding
import com.example.empowher.models.Report

class ReportsFragment : Fragment() {

    private var _binding: FragmentReportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupChips()
        setupRecyclerView()
    }

    private fun setupChips() {
        binding.chipAll.text = getString(R.string.all_reports, 3)
        binding.chipUnderReview.text = getString(R.string.under_review, 1)
    }

    private fun setupRecyclerView() {
        val dummyReports = listOf(
            Report(
                "EH-2026-000124",
                "Cyber Harassment",
                "Under Review",
                "Feb 21, 2026",
                "Banani, Dhaka",
                3,
                "Recurring non-consensual image distribution and online harassment via social platforms.",
                2,
                "Barrister N. Farhana",
                "View Timeline"
            ),
            Report(
                "EH-2026-000098",
                "Street Harassment",
                "Action Taken",
                "Feb 11, 2026",
                "Dhanmondi 27, Dhaka",
                1,
                "Verbal intimidation and stalking incident outside community center...",
                3,
                "Forwarded to DMP Women Support Cell",
                "View Response"
            ),
            Report(
                "EH-2026-000042",
                "Workplace Harassment",
                "Resolved",
                "Jan 10, 2026",
                "Gulshan-1, Dhaka",
                4,
                "Internal inquiry concluded in compliance with Bangladesh High...",
                4,
                "Closure report signed & archived securely",
                "Official Resolution"
            )
        )

        binding.rvReports.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ReportAdapter(dummyReports)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

package com.example.empowher.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import com.example.empowher.databinding.FragmentUsersBinding

class UsersFragment : Fragment() {
    private var _binding: FragmentUsersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        // Global Actions
        binding.ivNotification.setOnClickListener {
            showToast("Opening Notifications...")
        }
        binding.ivFilter.setOnClickListener {
            showToast("Opening Filters...")
        }
        binding.btnAddFieldStaff.setOnClickListener {
            showToast("Navigating to Add Staff/Partner...")
        }

        // Tab Selection (Visual simulation)
        binding.btnTabAll.setOnClickListener { showToast("Filtering: All Users") }
        binding.btnTabShielded.setOnClickListener { showToast("Filtering: Shielded Citizens") }
        binding.btnTabLegal.setOnClickListener { showToast("Filtering: Legal Counsel") }

        // User #SH-884 Card
        binding.btnViewActivityLog1.setOnClickListener {
            showToast("Viewing Activity Log for User #SH-884")
        }
        binding.btnEmergencyRing1.setOnClickListener {
            showToast("Triggering Emergency Ring for User #SH-884")
        }

        // Nusrat Jahan Card
        binding.btnManageProfile2.setOnClickListener {
            showToast("Managing Profile for Nusrat Jahan")
        }
        binding.btnAuditAccess2.setOnClickListener {
            showToast("Auditing Access for Nusrat Jahan")
        }

        // Adv. Farhana Rahman Card
        binding.btnDispatchCase3.setOnClickListener {
            showToast("Dispatching New Case to Adv. Farhana")
        }
        binding.btnMessage3.setOnClickListener {
            showToast("Messaging Adv. Farhana Rahman")
        }

        // Sub-Inspector Tanya K. Card
        binding.btnCallDirect4.setOnClickListener {
            showToast("Calling Sub-Inspector Tanya K. Direct")
        }
        binding.btnFieldPing4.setOnClickListener {
            showToast("Sending Field Ping to SI Tanya K.")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


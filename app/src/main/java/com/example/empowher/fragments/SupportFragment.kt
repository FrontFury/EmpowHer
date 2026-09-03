package com.example.empowher.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.empowher.R
import com.example.empowher.adapters.SupportOrgAdapter
import com.example.empowher.databinding.FragmentSupportBinding
import com.example.empowher.models.SupportOrg

class SupportFragment : Fragment() {
    private var _binding: FragmentSupportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSupportBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupDirectory()
    }

    private fun setupDirectory() {
        val orgs = listOf(
            SupportOrg(
                "1",
                getString(R.string.ask_title),
                getString(R.string.verified_legal_aid),
                getString(R.string.ask_desc),
                getString(R.string.ask_hours),
                getString(R.string.ask_address),
                R.drawable.ic_verified,
                getString(R.string.website),
                getString(R.string.call_now),
                getString(R.string.phone_ask)
            ),
            SupportOrg(
                "2",
                "One-Stop Crisis Centre (OCC) - DMCH",
                getString(R.string.govt_healthcare_forensic),
                getString(R.string.occ_desc),
                getString(R.string.occ_hours),
                getString(R.string.occ_address),
                R.drawable.ic_activity,
                getString(R.string.directions),
                getString(R.string.call_now),
                getString(R.string.phone_occ)
            ),
            SupportOrg(
                "3",
                "BNWLA (Women Lawyers\' Association)",
                getString(R.string.legal_defense_shelter),
                getString(R.string.bnwla_desc),
                getString(R.string.bnwla_hours),
                getString(R.string.bnwla_address),
                R.drawable.ic_security,
                getString(R.string.website),
                getString(R.string.call_now),
                getString(R.string.phone_bnwla)
            ),
            SupportOrg(
                "4",
                "Kaan Pete Roi Emotional Helpline",
                getString(R.string.mental_health_hotline),
                getString(R.string.kpr_desc),
                getString(R.string.kpr_hours),
                getString(R.string.kpr_confidential),
                R.drawable.ic_awareness,
                getString(R.string.website),
                getString(R.string.call_now),
                getString(R.string.phone_kpr)
            ),
            SupportOrg(
                "5",
                "BRAC Human Rights & Legal Services (HRLS)",
                getString(R.string.nationwide_ngo),
                getString(R.string.brac_hrls_desc),
                getString(R.string.brac_hrls_hours),
                getString(R.string.brac_hrls_address),
                R.drawable.ic_group,
                getString(R.string.find_district_office),
                getString(R.string.call_now),
                getString(R.string.phone_brac)
            )
        )

        binding.rvSupportDirectory.layoutManager = LinearLayoutManager(requireContext())
        binding.rvSupportDirectory.adapter = SupportOrgAdapter(orgs)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

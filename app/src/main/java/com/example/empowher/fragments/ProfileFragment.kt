package com.example.empowher.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.empowher.activities.SignInActivity
import com.example.empowher.databinding.FragmentProfileBinding
import com.example.empowher.models.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

        setupUserProfile()
        setupClickListeners()
    }

    private fun setupUserProfile() {
        val currentUser = auth.currentUser
        if (currentUser != null) {
            // Set initial data from Auth
            binding.tvUserName.text = currentUser.displayName ?: "User"
            binding.tvUserEmail.text = currentUser.email ?: ""

            // Fetch complete data from Firestore
            db.collection("users").document(currentUser.uid).get()
                .addOnSuccessListener { document ->
                    if (document != null && document.exists()) {
                        val user = document.toObject(User::class.java)
                        if (user != null) {
                            binding.tvUserName.text = user.name
                            binding.tvUserEmail.text = user.email
                            if (user.phone.isNotEmpty()) {
                                binding.tvUserPhone.text = user.phone
                            }
                        }
                    }
                }
                .addOnFailureListener { e ->
                    // Handle failure
                }
        }
    }

    private fun setupClickListeners() {
        binding.ivEditProfile.setOnClickListener {
            showToast("Edit Profile clicked")
        }

        binding.ivNotification.setOnClickListener {
            showToast("Notifications clicked")
        }

        binding.btnLogout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(activity, SignInActivity::class.java))
            activity?.finish()
        }

        binding.btnQuickSos.setOnClickListener {
            showToast("Quick SOS Triggered!")
        }

        // Section item clicks
        binding.layoutEmergencyContacts.setOnClickListener { showToast("Emergency Contacts clicked") }
        binding.layoutSosSettings.setOnClickListener { showToast("SOS Settings clicked") }
        binding.layoutIncidentReports.setOnClickListener { showToast("Incident Reports clicked") }
        binding.layoutMyStories.setOnClickListener { showToast("My Stories clicked") }
        binding.layoutSavedAwareness.setOnClickListener { showToast("Saved Awareness clicked") }
        binding.layoutLocationSharing.setOnClickListener { showToast("Location Sharing clicked") }
        binding.layoutHelpCenter.setOnClickListener { showToast("Help Center clicked") }
        binding.layoutAbout.setOnClickListener { showToast("About clicked") }
    }

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
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
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth

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

        setupUserProfile()

        binding.btnLogout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(activity, SignInActivity::class.java))
            activity?.finish()
        }

        binding.btnQuickSos.setOnClickListener {
            Toast.makeText(context, "Quick SOS Triggered!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUserProfile() {
        val user = auth.currentUser
        if (user != null) {
            binding.tvUserName.text = user.displayName ?: "User Name"
            binding.tvUserEmail.text = user.email ?: "email@example.com"
            // Phone and other details would typically come from Firestore
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}